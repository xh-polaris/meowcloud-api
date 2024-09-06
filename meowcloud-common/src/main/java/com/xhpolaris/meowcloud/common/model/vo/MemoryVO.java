package com.xhpolaris.meowcloud.common.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;

@ApiModel("存储信息展示")
@AllArgsConstructor
@Schema(description = "存储信息")
public class MemoryVO {

    // TODO 已使用内存的展示模式，初步计划为1Byte为最小存储单位
    @ApiModelProperty("已使用内存")
    private Long usedMemory;

    @ApiModelProperty("相片总数")
    private Long photoTotal;

    @ApiModelProperty("相册总数")
    private Long albumTotal;

    // 以1%为最小单位
    @ApiModelProperty("已使用的比例")
    private Integer rate;
}
