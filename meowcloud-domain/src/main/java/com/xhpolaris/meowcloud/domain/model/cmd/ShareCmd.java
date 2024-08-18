package com.xhpolaris.meowcloud.domain.model.cmd;

import com.xhpolaris.idlgen.meowcloud.action.TargetType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ShareCmd {
    @Data
    @Schema(name = "ShareCmd$DoShareCmd")
    public static class DoShareCmd {

        private String targetId;

        private TargetType targetType;
    }
}
