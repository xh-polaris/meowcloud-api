package com.xhpolaris.meowcloud.common.model.vo.user;

import com.xhpolaris.idlgen.basic.UserMeta;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MeowUserInfoVO {
    public UserMeta userMeta;
    public String signature;
    public String avatar;
    public String memberInfoId;
    public String albumInfoId;
    public String teamInfoId;
    public String memoryInfoId;
    public String pointInfoId;
    public String achievementInfoId;
}
