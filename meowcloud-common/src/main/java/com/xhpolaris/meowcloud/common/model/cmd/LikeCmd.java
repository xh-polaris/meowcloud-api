package com.xhpolaris.meowcloud.common.model.cmd;

import com.xhpolaris.idlgen.meowcloud.action.TargetType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class LikeCmd {
    @Data
    @Schema(name = "LikeCmd$DoLikeCmd")
    public static class DoLikeCmd {

        private String targetId;

        private TargetType targetType;
    }

    @Data
    @Schema(name = "LikeCmd$CancelLikeCmd")
    public static class CancelLikeCmd {

        private String targetId;

        private TargetType targetType;
    }
}
