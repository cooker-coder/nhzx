package com.nuaa.message.thirdparty.ali;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "nhzx.sms.ali")
public class AliProperties {
    private String accessId;
    private String accessSecret;
}
