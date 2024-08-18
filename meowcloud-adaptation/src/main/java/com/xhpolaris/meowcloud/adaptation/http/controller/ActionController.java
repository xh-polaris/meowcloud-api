package com.xhpolaris.meowcloud.adaptation.http.controller;

import com.xhpolaris.meowcloud.adaptation.http.api.ActionApi;
import com.xhpolaris.meowcloud.domain.model.cmd.FollowCmd;
import com.xhpolaris.meowcloud.domain.model.cmd.LikeCmd;
import com.xhpolaris.meowcloud.domain.model.cmd.ShareCmd;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ActionController implements ActionApi {
    @Override
    public boolean doLike(LikeCmd.DoLikeCmd cmd) {
        return false;
    }

    @Override
    public boolean cancelLike(LikeCmd.CancelLikeCmd cmd) {
        return false;
    }

    @Override
    public boolean doFollow(FollowCmd.DoFollowCmd cmd) {
        return false;
    }

    @Override
    public boolean cancelFollow(FollowCmd.CancelFollowCmd cmd) {
        return false;
    }

    @Override
    public boolean doShare(ShareCmd.DoShareCmd cmd) {
        return false;
    }
}
