package com.xhpolaris.meowcloud.common.model.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Schema(description = "团队简要信息")
public class TeamVO {
    // 团队id
    private String id;
    // 团队名称
    private String name;
}
