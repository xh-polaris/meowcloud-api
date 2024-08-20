package com.xhpolaris.meowcloud.common.context;

import com.xhpolaris.idlgen.basic.UserMeta;
import com.xhpolaris.meowcloud.common.model.entity.MeowUser;

public interface MeowContext {
    UserMeta getUserMeta();

    MeowUser getUser();

    String getId();
}
