package com.xhpolaris.meowcloud.infrastructure.config;

import io.opentelemetry.api.GlobalOpenTelemetry;
import io.opentelemetry.api.OpenTelemetry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenTelemetryConfig {

    @Bean
    OpenTelemetry getOpenTelemetry() {
        return GlobalOpenTelemetry.get();
    }
}
