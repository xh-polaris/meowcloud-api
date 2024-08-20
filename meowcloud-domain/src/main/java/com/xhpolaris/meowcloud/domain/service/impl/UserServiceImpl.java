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

        // TODO rpc获取存储信息

        // TODO 整合用户信息和存储信息转储到VO对象中

        return new MeowUserVO();
    }

    @Override
    public boolean updateUserInfo(UserCmd.updateUserCmd cmd) {
        // TODO 调用rpc更新用户信息
        return false;
    }
}
