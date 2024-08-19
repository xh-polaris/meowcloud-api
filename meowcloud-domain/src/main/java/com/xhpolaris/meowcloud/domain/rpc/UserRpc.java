package com.xhpolaris.meowcloud.domain.rpc;

import com.xhpolaris.idlgen.meowchat.user.GetUserResp;
import com.xhpolaris.idlgen.meowchat.user.UserServiceGrpc;
import com.xhpolaris.meowcloud.common.context.MeowContext;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserRpc {

    @GrpcClient("user")
    private UserServiceGrpc.UserServiceBlockingStub stub;

    private final MeowContext context;


}
