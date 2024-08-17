package com.xhpolaris.meowcloud;

import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@Slf4j
@EnableCaching
@RestController
@EnableScheduling
@SpringBootApplication
@EnableMongoAuditing
@EnableWebSecurity
@EnableConfigurationProperties
public class MeowcloudApplication {
    @Value("${server.servlet.context-path}")
    String path;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MeowcloudApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

    @GetMapping
    public void doc(HttpServletResponse response) throws IOException {
        log.info("hello");
        response.sendRedirect(String.format("%s/doc.html", path));
    }
}