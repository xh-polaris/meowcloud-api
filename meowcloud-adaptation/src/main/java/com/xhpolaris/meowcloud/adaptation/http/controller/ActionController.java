package com.xhpolaris.meowcloud.adaptation.http.controller;

import com.xhpolaris.meowcloud.adaptation.http.api.ActionApi;
import com.xhpolaris.meowcloud.common.model.cmd.FollowCmd;
import com.xhpolaris.meowcloud.common.model.cmd.LikeCmd;
import com.xhpolaris.meowcloud.common.model.cmd.ShareCmd;
import com.xhpolaris.meowcloud.domain.service.ActionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ActionController implements ActionApi {

    private final ActionService service;


    @Override
    public boolean doLike(LikeCmd.DoLikeCmd cmd) {
        return service.doLike(cmd);
    }

    @Override
    public boolean cancelLike(LikeCmd.CancelLikeCmd cmd) {
        return service.cancelLike(cmd);
    }

    @Override
    public boolean doFollow(FollowCmd.DoFollowCmd cmd) {
        return service.doFollow(cmd);
    }

    @Override
    public boolean cancelFollow(FollowCmd.CancelFollowCmd cmd) {
        return service.cancelFollow(cmd);
    }

    @Override
    public boolean doShare(ShareCmd.DoShareCmd cmd) {
        return service.doShare(cmd);
    }
}
