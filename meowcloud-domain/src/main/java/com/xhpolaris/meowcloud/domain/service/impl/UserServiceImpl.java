package com.xhpolaris.meowcloud.domain.service.impl;

import com.xhpolaris.idlgen.basic.APP;
import com.xhpolaris.idlgen.basic.UserMeta;
import com.xhpolaris.meowcloud.common.model.cmd.UserCmd;
import com.xhpolaris.meowcloud.common.model.vo.MemoryVO;
import com.xhpolaris.meowcloud.common.model.vo.user.MeowUserInfoVO;
import com.xhpolaris.meowcloud.common.model.vo.user.MeowUserVO;
import com.xhpolaris.meowcloud.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @Override
    public MeowUserVO getUserInfo() {
        return new MeowUserVO("用户id123456","用户名","啥也没有写","https://cdn.oaistatic.com/assets/favicon-32x32-frb1kl3v.webp",12,23,5,999,new MemoryVO(1024*1024L,128L,23L,51));
    }

    @Override
    public boolean updateUserInfo(UserCmd.updateUserCmd cmd) {
        return true;
    }

    @Override
    public MeowUserInfoVO getUserDetailInfo() {
        return new MeowUserInfoVO(UserMeta.newBuilder().setUserId("用户id123456").setAppId(APP.valueOf("wx5cd5f83abe0ab38e")).setDeviceId("test").setSessionAppId(APP.valueOf("wx5cd5f83abe0ab38e")).setIsLogin(true).build(),
                "个性签名","https://cdn.oaistatic.com/assets/favicon-32x32-frb1kl3v.webp","memberInfoId123456","albumInfoId123456",
                "teamInfoId123456","memoryInfoId123456","pointInoId123456","achievementInfoId123456"
                );
    }

//    private final UserRpc userRpc;
//
//    @Override
//    public MeowUserVO getUserInfo() {
//        // TODO rpc获取用户信息 待完善
//
//        // TODO rpc获取存储信息
//
//        // TODO 整合用户信息和存储信息转储到VO对象中
//
//        return new MeowUserVO();
//    }
//
//    @Override
//    public boolean updateUserInfo(UserCmd.updateUserCmd cmd) {
//        // TODO 调用rpc更新用户信息
//        return false;
//    }
}
