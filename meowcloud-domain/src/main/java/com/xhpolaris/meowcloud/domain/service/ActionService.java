package com.xhpolaris.meowcloud.domain.service;

import com.xhpolaris.meowcloud.common.model.cmd.FollowCmd;
import com.xhpolaris.meowcloud.common.model.cmd.LikeCmd;
import com.xhpolaris.meowcloud.common.model.cmd.ShareCmd;
import org.springframework.stereotype.Service;

public interface ActionService {
    boolean doLike(LikeCmd.DoLikeCmd cmd);

    boolean cancelLike(LikeCmd.CancelLikeCmd cmd);

    boolean doFollow(FollowCmd.DoFollowCmd cmd);

    boolean cancelFollow(FollowCmd.CancelFollowCmd cmd);

    boolean doShare(ShareCmd.DoShareCmd cmd);
}
