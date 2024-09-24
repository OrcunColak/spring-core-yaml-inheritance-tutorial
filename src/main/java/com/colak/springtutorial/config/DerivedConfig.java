package com.colak.springtutorial.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "derived-config")
@Getter
@Setter
public class DerivedConfig {

    private String key1;
    private String key2;
}
