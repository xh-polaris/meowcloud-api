package com.xhpolaris.meowcloud.common.model.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(description = "猫猫信息")
public class CatVO {
    // 猫猫id
    private String id;
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
