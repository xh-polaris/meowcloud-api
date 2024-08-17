package com.xhpolaris.meowcloud.adaptation.config;

import io.opentelemetry.api.trace.Span;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import io.opentelemetry.context.Context;

import javax.annotation.Nonnull;

@Configuration
public class TraceConfig implements WebMvcConfigurer {

    /**
     * 注册拦截器拦截/api开头的请求
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new TraceInterceptor())
                .addPathPatterns("/api/**")  // 拦截的路径
                .excludePathPatterns("/public/**");  // 排除的路径
    }
}

class TraceInterceptor implements HandlerInterceptor {

    /**
     * 定义拦截器的pre操作
     * 获取当前的前traceId并添加到响应头的X-Trace-Id中
     */
    @Override
    public boolean preHandle(@Nonnull HttpServletRequest request, @Nonnull HttpServletResponse response,@Nonnull Object handler) {
        Span currentSpan = Span.fromContext(Context.current());
        // 获取当前请求的Trace ID
        String traceId = currentSpan.getSpanContext().getTraceId();
        response.addHeader("X-Trace-Id", traceId);
        return true;
    }
}