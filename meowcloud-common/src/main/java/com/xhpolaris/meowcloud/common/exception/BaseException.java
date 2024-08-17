package com.xhpolaris.meowcloud.common.exception;

import com.xhpolaris.meowcloud.common.enums.ExceptionEn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
// 基础异常类
public class BaseException  extends Throwable{

    private Integer code;

    private String msg;

    // 通过枚举构造异常
    public BaseException(ExceptionEn exception) {
        code = exception.getCode();
        msg = exception.getMsg();
    }

}
