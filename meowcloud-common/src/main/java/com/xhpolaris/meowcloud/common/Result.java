package com.xhpolaris.meowcloud.common;

import com.xhpolaris.meowcloud.common.exception.BaseException;
import lombok.Data;

@Data
public class Result {

    private Integer code;

    private String msg;

    private Object payload;

    public static Result Success(Object payload) {
        Result result = new Result();

        result.setCode(0);
        result.setMsg("success");
        result.setPayload(payload);

        return result;
    }

    // 常规错误
    public static Result fail(BaseException exception) {
        Result result = new Result();

        result.setCode(exception.getCode());
        result.setMsg(exception.getMsg());
        result.setPayload(null);

        return result;
    }

    // 临时错误
    public static Result fail(String msg) {
        Result result = new Result();

        result.setCode(999);
        result.setMsg(msg);
        result.setPayload(null);

        return result;
    }

    // 未知错误
    public static Result fail() {
        Result result = new Result();

        result.setCode(-1);
        result.setMsg("未知错误");
        result.setPayload(null);

        return result;
    }

}
