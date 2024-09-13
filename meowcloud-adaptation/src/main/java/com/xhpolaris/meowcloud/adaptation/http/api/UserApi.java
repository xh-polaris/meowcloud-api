package com.xhpolaris.meowcloud.adaptation.http.api;

import com.xhpolaris.meowcloud.common.model.cmd.UserCmd;
import com.xhpolaris.meowcloud.common.model.vo.user.MeowUserInfoVO;
import com.xhpolaris.meowcloud.common.model.vo.user.MeowUserVO;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Tag(name = "UserApi",description = "用户相关接口")
@RequestMapping("/api/user")
public interface UserApi {

    // 获取用户各模块信息
    @GetMapping("/info")
    MeowUserInfoVO getUserDetailInfo();

    // 获取"我的"页用户基本信息
    @GetMapping
    MeowUserVO getUserInfo();

    // 更新用户信息
    @PostMapping
    boolean updateUserInfo(@RequestBody UserCmd.updateUserCmd cmd);
}
