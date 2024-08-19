package com.xhpolaris.meowcloud.domain.service.impl;

import com.xhpolaris.meowcloud.common.model.cmd.UserCmd;
import com.xhpolaris.meowcloud.common.model.vo.MeowUserVO;
import com.xhpolaris.meowcloud.domain.rpc.UserRpc;
import com.xhpolaris.meowcloud.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRpc userRpc;

    @Override
    public MeowUserVO getUserInfo() {
        // TODO rpc获取用户信息 待完善
        return new MeowUserVO();
    }

    @Override
    public boolean updateUserInfo(UserCmd.updateUserCmd cmd) {
        // TODO 待完善
        return false;
    }
}
