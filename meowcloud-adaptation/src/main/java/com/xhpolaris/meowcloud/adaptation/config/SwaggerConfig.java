package com.xhpolaris.meowcloud.adaptation.config;

import com.xhpolaris.meowcloud.common.properties.DocInfoProperties;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xhpolaris.meowcloud")
@Configuration
@RequiredArgsConstructor
@ConditionalOnProperty(name = "doc-info.enable",havingValue = "true") // 当application.yml存在doc-info.enable: true 属性时注册这个Bean
public class SwaggerConfig {

    private final DocInfoProperties docInfo;

    /**
     * 配置openAPI
     * 描述Swagger文档的基本信息
     */
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI().info(new Info().title(docInfo.getTitle())
                        .description(docInfo.getDescription())
                        .version(docInfo.getVersion()))
                .externalDocs(new ExternalDocumentation()
                        .description(docInfo.getDescription())
                        .url(docInfo.getWebsiteUrl()));
    }

    /**
     * 配置分组API文档
     */
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group(docInfo.getDescription()) // 设置分组名称
                .pathsToMatch("/api/**")  // 分组匹配的pattern
                .build();
    }

}
