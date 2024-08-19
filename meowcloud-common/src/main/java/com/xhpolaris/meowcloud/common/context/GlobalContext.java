package com.xhpolaris.meowcloud.common.context;

import com.xhpolaris.idlgen.basic.UserMeta;
import com.xhpolaris.meowcloud.common.properties.AppProperties;
import com.xhpolaris.meowcloud.common.model.entity.MeowUser;
import lombok.Data;
import org.springframework.stereotype.Component;

// TODO 修改线程上下文
@Data
@Component
public class GlobalContext implements MeowContext {

    private AppProperties appProperties;

    private MeowUser meowUser;

    private String uid;

    @Override
    public AppProperties getProperties() {
        return appProperties;
    }

    @Override
    public MeowUser getUser() {
        return meowUser;
    }

    @Override
    public UserMeta getUserMeta() {
        return meowUser.getUserMeta();
    }
}
