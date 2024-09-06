package com.xhpolaris.meowcloud.common.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

@ApiModel("简要用户信息展示")
@Data
@AllArgsConstructor
@Schema(description = "用户详细信息")
public class MeowUserVO {
    @ApiModelProperty("用户id")
    private String id;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("个人简介")
    private String signature;

    @ApiModelProperty("头像")
    private String avatar;

    @ApiModelProperty("我的相册数")
    private Integer createAlbums;

    @ApiModelProperty("关注的相册数")
    private Integer followedAlbums;

    @ApiModelProperty("我的团队数")
    private Integer teams;

    @ApiModelProperty("我的积分数")
    private Integer points;

    @ApiModelProperty("存储信息")
    private MemoryVO memory;
}
