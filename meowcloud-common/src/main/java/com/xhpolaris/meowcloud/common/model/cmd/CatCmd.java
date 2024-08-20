package com.xhpolaris.meowcloud.common.model.cmd;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CatCmd {

    @Data
    @Schema(name = "CatCmd$UpdateCatCmd")
    public static class UpdateCatCmd {
        // 昵称
        private String name;
        // 年龄
        private Long age;
        // 类型 TODO 类型标识方式
        private String type;
        // 品种 TODO 品种标识方式
        private String breed;
        // 出没地区 TODO 出没地区标识方式
        private String area;
        // 撸猫指南
        private String content;
    }
}
