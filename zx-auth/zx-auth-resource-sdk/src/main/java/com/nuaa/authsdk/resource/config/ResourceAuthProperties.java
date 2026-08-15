package com.nuaa.authsdk.resource.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties(prefix = "nhzx.auth.resource")
public class ResourceAuthProperties {
    private Boolean enable = false;
    private List<String> includeLoginPaths;
    private List<String> excludeLoginPaths;
}
