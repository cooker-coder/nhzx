package com.nuaa.message.properties;

import lombok.Data;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * 线程池配置
 * @ClassName ThreadPoolProperties
 * @author 开源社区
 * @since 2026-06-30
 * @version 1.0.0
 **/
@Configuration
@Data
public class ThreadPoolProperties {

    @NestedConfigurationProperty
    private Map<String, Object> threadPools;


}
