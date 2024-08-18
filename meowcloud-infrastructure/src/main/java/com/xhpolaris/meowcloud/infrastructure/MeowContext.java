package com.xhpolaris.meowcloud.infrastructure;

import com.xhpolaris.meowcloud.common.properties.AppProperties;
import com.xhpolaris.meowcloud.domain.model.entity.MeowUser;
import org.springframework.context.ApplicationEvent;

public interface MeowContext {
    void publish(ApplicationEvent event);

    AppProperties properties();

    MeowUser getUser();

    String uid();
}
