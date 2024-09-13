package com.xhpolaris.meowcloud.common.model.vo.user;

import com.xhpolaris.idlgen.basic.UserMeta;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MeowUserInfoVO {
    UserMeta userMeta;
    String signature;
    String avatar;
    String memberInfoId;
    String albumInfoId;
    String teamInfoId;
    String memoryInfoId;
    String pointInfoId;
    String achievementInfoId;
}
