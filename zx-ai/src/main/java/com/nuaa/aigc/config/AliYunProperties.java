package com.nuaa.aigc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "nhzx.ali")
public class AliYunProperties {

    private OssProperties oss;

    @Data
    public static class OssProperties {
        private String accessId;
        private String accessKey;
        private String endpoint;
        private String bucket;
    }
}
