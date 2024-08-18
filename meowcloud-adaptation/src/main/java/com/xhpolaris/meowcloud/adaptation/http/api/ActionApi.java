package com.xhpolaris.meowcloud.adaptation.http.api;

import com.xhpolaris.meowcloud.domain.model.cmd.FollowCmd;
import com.xhpolaris.meowcloud.domain.model.cmd.LikeCmd;
import com.xhpolaris.meowcloud.domain.model.cmd.ShareCmd;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Tag(name = "ActionApi", description = "用户行为接口")
@RequestMapping("/api/action")
public interface ActionApi {
    // like
    @PostMapping("/like")
    @Operation(summary = "点赞")
    boolean doLike(@RequestBody LikeCmd.DoLikeCmd cmd);

    @PostMapping("/like/cancel")
    @Operation(summary = "取消点赞")
    boolean cancelLike(@RequestBody LikeCmd.CancelLikeCmd cmd);


    // follow
    @PostMapping("/follow")
    @Operation(summary = "关注")
    boolean doFollow(@RequestBody FollowCmd.DoFollowCmd cmd);

    @PostMapping("/follow/cancel")
    @Operation(summary = "取消关注")
    boolean cancelFollow(@RequestBody FollowCmd.CancelFollowCmd cmd);


    // share
    @PostMapping("/share")
    @Operation(summary = "分享")
    boolean doShare(@RequestBody ShareCmd.DoShareCmd cmd);
}
