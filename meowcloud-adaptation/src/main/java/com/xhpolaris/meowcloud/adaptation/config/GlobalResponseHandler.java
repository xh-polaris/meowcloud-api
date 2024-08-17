package com.xhpolaris.meowcloud.adaptation.config;

import com.xhpolaris.meowcloud.common.Result;
import com.xhpolaris.meowcloud.common.exception.BaseException;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.annotation.Nonnull;

// 全局响应处理，同一返回格式
@RestControllerAdvice(basePackages = "com.xhpolaris.meowcloud.http")
public class GlobalResponseHandler implements ResponseBodyAdvice<Object> {


    @Override
    public boolean supports(@Nonnull MethodParameter returnType,@Nonnull Class converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body,
                                  @Nonnull MethodParameter returnType,
                                  @Nonnull MediaType selectedContentType,
                                  @Nonnull Class selectedConverterType,
                                  @Nonnull ServerHttpRequest request,
                                  @Nonnull ServerHttpResponse response) {
        // body为错误时设置为失败
        if (body instanceof BaseException baseException) {
            return Result.fail(baseException);
        }
        // body已经是Result时直接返回，避免嵌套
        if (body instanceof Result) {
            return body;
        }
        // 常规情况
        return Result.Success(body);
    }
}
