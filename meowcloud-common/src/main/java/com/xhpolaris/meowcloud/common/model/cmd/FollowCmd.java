package com.xhpolaris.meowcloud.common.model.cmd;

import com.xhpolaris.idlgen.meowcloud.action.TargetType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class FollowCmd {
    @Data
    @Schema(name = "FollowCmd$DoFollowCmd")
    public static class DoFollowCmd {

        private String targetId;

        private TargetType targetType;
    }

    @Data
    @Schema(name = "FollowCmd$CancelFollowCmd")
    public static class CancelFollowCmd {

        private String targetId;

        private TargetType targetType;
    }
}
