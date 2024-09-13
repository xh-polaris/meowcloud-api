package com.xhpolaris.meowcloud.domain.service;

import com.xhpolaris.meowcloud.common.model.cmd.UserCmd;
import com.xhpolaris.meowcloud.common.model.vo.user.MeowUserInfoVO;
import com.xhpolaris.meowcloud.common.model.vo.user.MeowUserVO;


public interface UserService {
    MeowUserVO getUserInfo();

    boolean updateUserInfo(UserCmd.updateUserCmd cmd);

    MeowUserInfoVO getUserDetailInfo();
}
