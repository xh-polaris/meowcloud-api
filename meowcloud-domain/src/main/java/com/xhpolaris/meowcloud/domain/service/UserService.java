package com.xhpolaris.meowcloud.domain.service;

import com.xhpolaris.meowcloud.common.model.cmd.UserCmd;
import com.xhpolaris.meowcloud.common.model.vo.MeowUserVO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    MeowUserVO getUserInfo();

    boolean updateUserInfo(UserCmd.updateUserCmd cmd);
}
