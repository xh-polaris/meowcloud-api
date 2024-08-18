package com.xhpolaris.meowcloud.common;

import ch.qos.logback.core.encoder.JsonEscapeUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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

    public static String immediateFail(BaseException exception) {
        Result result = new Result();

        result.setCode(exception.getCode());
        result.setMsg(exception.getMsg());
        result.setPayload(null);

        return JsonUtil.toJson(result);
    }

    public static class JsonUtil {

        private static final ObjectMapper objectMapper = new ObjectMapper();

        // 私有构造函数，防止实例化
        private JsonUtil() {
        }

        /**
         * 将对象转换为 JSON 字符串
         *
         * @param object 需要转换的对象
         * @return JSON 字符串
         */
        public static String toJson(Object object) {
            try {
                return objectMapper.writeValueAsString(object);
            } catch (JsonProcessingException e) {
                // 返回一个空的 JSON 对象字符串，或者可以根据需要返回其他默认值
                return "{'code':'-1','msg':'位置错误'}";
            }
        }
    }
}
