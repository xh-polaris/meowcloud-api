package com.xhpolaris.meowcloud.infrastructure.rpc;

import com.xhpolaris.idlgen.meowcloud.action.ActionServiceGrpc;
import com.xhpolaris.idlgen.meowcloud.action.DoLikeReq;
import com.xhpolaris.idlgen.meowcloud.action.DoLikeReqOrBuilder;
import com.xhpolaris.idlgen.meowcloud.action.DoLikeResp;
import com.xhpolaris.idlgen.platform.sts.StsServiceGrpc;
import com.xhpolaris.meowcloud.domain.model.cmd.LikeCmd;
import com.xhpolaris.meowcloud.infrastructure.MeowContext;
import com.xhpolaris.meowcloud.infrastructure.util.RpcUtil;
import io.grpc.stub.annotations.GrpcGenerated;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ActionRpc {

    @GrpcClient("action")
    private ActionServiceGrpc.ActionServiceBlockingStub stub;
    private final MeowContext context;

    public DoLikeResp doLike(LikeCmd.DoLikeCmd cmd) {

        DoLikeReq req = DoLikeReq.newBuilder().build();
        RpcUtil.copy(req, List.of(cmd));
        return stub.doLike(req);
    }
}
