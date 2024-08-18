package com.xhpolaris.meowcloud.infrastructure.util;

import javax.annotation.Nonnull;
import java.lang.reflect.Field;
import java.util.List;

public class RpcUtil {
    public static void copy(@Nonnull Object dest, @Nonnull List<Object> sources) {
        if (sources.isEmpty()) {
            throw new IllegalArgumentException("拷贝来源不允许为空");
        }

        Class<?> destClass = dest.getClass();

        try {
            for (Object source : sources) {
                if (source == null) {
                    continue;
                }

                Class<?> sourceClass = source.getClass();
                Field[] sourceFields = sourceClass.getDeclaredFields();

                for (Field field : sourceFields) {
                    field.setAccessible(true);
                    Object value = field.get(source);

                    try {
                        Field destField = destClass.getDeclaredField(field.getName());
                        destField.setAccessible(true);

                        // 检查字段类型是否匹配
                        if (destField.getType().isAssignableFrom(field.getType())) {
                            destField.set(dest, value);
                        } else {
                            throw new IllegalArgumentException("字段类型不匹配: " + field.getName());
                        }
                    } catch (NoSuchFieldException e) {
                        // 目标对象中没有对应字段，则忽略
                    }
                }
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException("rpc请求对象复制失败", e);
        }
    }
}