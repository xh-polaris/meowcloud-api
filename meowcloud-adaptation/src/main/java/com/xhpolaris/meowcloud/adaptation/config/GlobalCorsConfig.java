package com.xhpolaris.meowcloud.adaptation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class GlobalCorsConfig {

    /**
     * 配置允许跨域调用的过滤器
     */
    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();
        // 将所有的域名设置为允许通过
        config.addAllowedOrigin("*");
        // 允许跨域cookie
        config.setAllowCredentials(true);
        // 将所有的头设置为允许通过
        config.addAllowedHeader("*");
        // 将所有请求方法设置为允许通过
        config.addAllowedMethod("*");

        // 用于管理URL到CORS配置的类
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        // 将给所有的路径注册这个配置
        source.registerCorsConfiguration("/**",config);

        return new CorsFilter(source);

    }
}
