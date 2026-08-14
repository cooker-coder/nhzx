# nhzx 本地 Docker 基础环境

本目录用于集中管理“南航智学（nhzx）”的本地开发依赖。当前只提供基础中间件，业务服务本身仍由 Maven/IDE 启动，后续可按模块逐步容器化。

## 已包含服务

| 服务 | 镜像 | 对外端口 | 默认账号 |
|------|------|----------|----------|
| MySQL | `mysql:8.0.35` | `13306` | `root / 123456` |
| Redis | `redis:7.2-alpine` | `16379` | 密码 `123456` |
| RabbitMQ | `nhzx/rabbitmq:3.12-delayed` | `5672` / `15672` | `nhzx / nhzx123` |
| Nacos | `nacos/nacos-server:v2.3.2` | `8848` / `9848` / `9849` | `nacos / nacos` |
| Elasticsearch | `docker.elastic.co/elasticsearch/elasticsearch:7.17.14` | `9200` / `9300` | 未开启安全认证 |
| Kibana | `docker.elastic.co/kibana/kibana:7.17.14` | `5601` | 无 |
| MongoDB | `mongo:7.0` | `27017` | `root / 123456`，应用库 `nhzx / 123321` |
| XXL-Job Admin | `xuxueli/xxl-job-admin:2.4.0` | `9090` | `admin / 123456` |

## 启动

```powershell
cd F:\JAVAProject\nhzx\docker
docker compose up -d --build
docker compose ps
```

首次启动会自动执行 `mysql/init` 下的 SQL，创建各业务库及 XXL-Job 调度库。

## 初始化 Nacos 共享配置

中间件启动后，在 PowerShell 中执行：

```powershell
cd F:\JAVAProject\nhzx\docker\nacos
.\import-config.ps1
```

脚本会在 Nacos 中创建 `nhzx` 命名空间，并把 `config` 目录下的 `shared-*.yaml` 发布为 `DEFAULT_GROUP` 配置。业务服务后续的 `application-local.yml` 可通过 `spring.config.import` 引用这些配置。

## 访问地址

- Nacos 控制台：http://localhost:8848/nacos
- RabbitMQ 管理台：http://localhost:15672
- Kibana：http://localhost:5601
- XXL-Job：http://localhost:9090/xxl-job-admin

## 注意

- RabbitMQ 镜像在构建时会下载 `rabbitmq_delayed_message_exchange-3.12.0.ez`，用于交易服务的订单超时延迟队列。
- Elasticsearch 若启动失败，常见原因是宿主机 `vm.max_map_count` 过小；Docker Desktop/WSL2 环境下通常可正常启动，必要时执行 `wsl -d docker-desktop sysctl -w vm.max_map_count=262144`。
- `.env` 中的密码仅用于本地开发，后续接入真实环境时请替换。
