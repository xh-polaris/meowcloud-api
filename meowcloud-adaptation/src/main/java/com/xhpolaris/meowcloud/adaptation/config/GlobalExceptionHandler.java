package com.xhpolaris.meowcloud.adaptation.config;

import com.xhpolaris.meowcloud.common.Result;
import com.xhpolaris.meowcloud.common.exception.BaseException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

// 全局异常处理
@RestControllerAdvice
public class GlobalExceptionHandler {
    // 抛出BaseException时直接转换成Result返回
    @ExceptionHandler(BaseException.class)
    public Result baseExceptionHandler(BaseException baseException) {
        return Result.fail(baseException);
    }
}
