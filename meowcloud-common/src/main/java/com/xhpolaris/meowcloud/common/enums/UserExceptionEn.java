package com.xhpolaris.meowcloud.common.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum UserExceptionEn implements ExceptionEn{
    ERROR_TOKEN(1001,"用户认证信息错误，请重新登陆")
    ;

    final Integer code;
    final String msg;

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
