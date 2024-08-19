package com.xhpolaris.meowcloud.common.context;

import com.xhpolaris.idlgen.basic.UserMeta;
import com.xhpolaris.meowcloud.common.properties.AppProperties;
import com.xhpolaris.meowcloud.common.model.entity.MeowUser;

// TODO 根据uid和properties的作用来修改用户上下文
public interface MeowContext {
    AppProperties getProperties();

    MeowUser getUser();

    UserMeta getUserMeta();

    String getUid();
}
