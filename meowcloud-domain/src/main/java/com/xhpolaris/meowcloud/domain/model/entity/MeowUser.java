package com.xhpolaris.meowcloud.domain.model.entity;

import com.xhpolaris.idlgen.basic.UserMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("猫猫云用户")
@Data
public class MeowUser {

    @ApiModelProperty("用户元数据")
    private UserMeta userMeta;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("个人简介")
    private String signature;

    @ApiModelProperty("头像")
    private String avatar;

    @ApiModelProperty("会员信息id")
    private String memberId;

    @ApiModelProperty("团队信息id")
    private String teamInfoId;

    @ApiModelProperty("相册信息id")
    private String albumInfoId;

    @ApiModelProperty("存储信息")
    private String memoryInfoId;

    @ApiModelProperty("积分信息")
    private String pointInfoId;

    @ApiModelProperty("成就信息")
    private String achievementInfoId;
}
