package com.xhpolaris.meowcloud.domain.rpc;

import com.xhpolaris.idlgen.meowcloud.action.*;
import com.xhpolaris.meowcloud.common.model.cmd.FollowCmd;
import com.xhpolaris.meowcloud.common.model.cmd.LikeCmd;
import com.xhpolaris.meowcloud.common.context.MeowContext;
import com.xhpolaris.meowcloud.common.model.cmd.ShareCmd;
import com.xhpolaris.meowcloud.infrastructure.util.RpcUtil;
import io.grpc.StatusException;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ActionRpc {

    @GrpcClient("action")
    private ActionServiceGrpc.ActionServiceBlockingStub stub;
    private final MeowContext context;

    public boolean doLike(LikeCmd.DoLikeCmd cmd) {

        DoLikeReq req = DoLikeReq.newBuilder().build();
        RpcUtil.copy(req, List.of(cmd, context.getUserMeta()));
        // TODO rpc异常处理
        try {
            DoLikeResp resp = stub.doLike(req);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean cancelLike(LikeCmd.CancelLikeCmd cmd) {
        CancelLikeReq req = CancelLikeReq.newBuilder().build();
        RpcUtil.copy(req, List.of(cmd, context.getUserMeta()));
        // TODO rpc异常处理
        try {
            CancelLikeResp resp = stub.cancelLike(req);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean doFollow(FollowCmd.DoFollowCmd cmd) {
        DoFollowReq req = DoFollowReq.newBuilder().build();
        RpcUtil.copy(req, List.of(cmd, context.getUserMeta()));
        // TODO rpc异常处理
        try {
            DoFollowResp resp = stub.doFollow(req);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean cancelFollow(FollowCmd.CancelFollowCmd cmd) {
        CancelFollowReq req = CancelFollowReq.newBuilder().build();
        RpcUtil.copy(req, List.of(cmd, context.getUserMeta()));
        // TODO rpc异常处理
        try {
            CancelFollowResp resp = stub.cancelFollow(req);
        } catch (Exception e) {
            return false;
        }
        return true;

    }

    public boolean doShare(ShareCmd.DoShareCmd cmd) {
        DoShareReq req = DoShareReq.newBuilder().build();
        RpcUtil.copy(req, List.of(cmd, context.getUserMeta()));
        // TODO rpc异常处理
        try {
            DoShareResp resp = stub.doShare(req);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
