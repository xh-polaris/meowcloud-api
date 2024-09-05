package com.xhpolaris.meowcloud.domain.service.impl;

import com.xhpolaris.meowcloud.common.model.cmd.FollowCmd;
import com.xhpolaris.meowcloud.common.model.cmd.LikeCmd;
import com.xhpolaris.meowcloud.common.model.cmd.ShareCmd;
import com.xhpolaris.meowcloud.domain.rpc.ActionRpc;
import com.xhpolaris.meowcloud.domain.service.ActionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActionServiceImpl implements ActionService {


    private final ActionRpc actionRpc;


    @Override
    public boolean doLike(LikeCmd.DoLikeCmd cmd) {
        return actionRpc.doLike(cmd);
    }

    @Override
    public boolean cancelLike(LikeCmd.CancelLikeCmd cmd) {
        return actionRpc.cancelLike(cmd);
    }

    @Override
    public boolean doFollow(FollowCmd.DoFollowCmd cmd) {
        return actionRpc.doFollow(cmd);
    }

    @Override
    public boolean cancelFollow(FollowCmd.CancelFollowCmd cmd) {
        return actionRpc.cancelFollow(cmd);
    }

    @Override
    public boolean doShare(ShareCmd.DoShareCmd cmd) {
        return actionRpc.doShare(cmd);
    }
}
