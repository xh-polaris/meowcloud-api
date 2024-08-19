package com.xhpolaris.meowcloud.adaptation.http.controller;

import com.xhpolaris.meowcloud.adaptation.http.api.UserApi;
import com.xhpolaris.meowcloud.common.model.cmd.UserCmd;
import com.xhpolaris.meowcloud.common.model.vo.MeowUserVO;
import com.xhpolaris.meowcloud.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class UserController implements UserApi {

    private final UserService userService;

    @Override
    public MeowUserVO getUserInfo() {
        return userService.getUserInfo();
    }

    @Override
    public boolean updateUserInfo(UserCmd.updateUserCmd cmd) {
        return userService.updateUserInfo(cmd);
    }
}
