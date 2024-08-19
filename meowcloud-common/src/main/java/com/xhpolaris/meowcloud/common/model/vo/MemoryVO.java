package com.xhpolaris.meowcloud.common.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.checkerframework.checker.units.qual.A;

@ApiModel("存储信息展示")
public class MemoryVO {

    // TODO 已使用内存的展示模式，初步计划为1K为最小存储单位
    @ApiModelProperty("已使用内存")
    private Integer usedMemory;

    @ApiModelProperty("相片总数")
    private Integer photoTotal;

    @ApiModelProperty("相册总数")
    private Integer albumTotal;

    // 以1%为最小单位
    @ApiModelProperty("已使用的比例")
    private Integer rate;
}
