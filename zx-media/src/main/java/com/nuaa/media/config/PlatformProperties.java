package com.nuaa.media.config;

import com.nuaa.media.enums.Platform;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "nhzx.platform")
public class PlatformProperties {
    private Platform file;
    private Platform media;
}
