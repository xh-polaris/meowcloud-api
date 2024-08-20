package com.xhpolaris.meowcloud.common.context;

import com.xhpolaris.idlgen.basic.UserMeta;
import com.xhpolaris.meowcloud.common.model.entity.MeowUser;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class GlobalContext implements MeowContext {

    private ThreadLocal<MeowUser> userThreadLocal;

    @Override
    public UserMeta getUserMeta() {
        return userThreadLocal.get().getUserMeta();
    }

    @Override
    public MeowUser getUser() {
        return userThreadLocal.get();
    }

    @Override
    public String getId() {
        return userThreadLocal.get().getUserMeta().getUserId();
    }
}
