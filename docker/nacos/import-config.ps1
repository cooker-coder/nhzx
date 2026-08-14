param(
    [string]$NacosBaseUrl = "http://localhost:8848",
    [string]$Username = "nacos",
    [string]$Password = "nacos",
    [string]$Group = "DEFAULT_GROUP",
    [string]$NamespaceId = "nhzx"
)

$ErrorActionPreference = "Stop"

$loginBody = @{ username = $Username; password = $Password }
$login = Invoke-RestMethod -Method Post -Uri "$NacosBaseUrl/nacos/v1/auth/login" -Body $loginBody -ContentType "application/x-www-form-urlencoded"
$token = $login.accessToken
if (-not $token) {
    throw "Nacos login failed, no accessToken returned."
}

$nsBody = @{
    customNamespaceId = $NamespaceId
    namespaceName     = $NamespaceId
    namespaceDesc     = "nhzx local development namespace"
    accessToken       = $token
}
try {
    Invoke-RestMethod -Method Post -Uri "$NacosBaseUrl/nacos/v1/console/namespaces" -Body $nsBody -ContentType "application/x-www-form-urlencoded" | Out-Null
    Write-Host "Namespace '$NamespaceId' created."
}
catch {
    if ($_.Exception.Message -notmatch "duplicate|already.exist") {
        Write-Warning ("Namespace creation skipped: {0}" -f $_.Exception.Message)
    }
}

$configDir = Join-Path $PSScriptRoot "config"
Get-ChildItem -Path $configDir -Filter "*.yaml" | ForEach-Object {
    $content = Get-Content -Path $_.FullName -Raw -Encoding UTF8
    $publishBody = @{
        tenant      = $NamespaceId
        dataId      = $_.Name
        group       = $Group
        type        = "yaml"
        content     = $content
        accessToken = $token
    }
    Invoke-RestMethod -Method Post -Uri "$NacosBaseUrl/nacos/v1/cs/configs" -Body $publishBody -ContentType "application/x-www-form-urlencoded" | Out-Null
    Write-Host ("Published {0} to namespace '{1}'." -f $_.Name, $NamespaceId)
}
