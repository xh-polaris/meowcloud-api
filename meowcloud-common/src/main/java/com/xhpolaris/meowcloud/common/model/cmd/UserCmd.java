package com.xhpolaris.meowcloud.common.model.cmd;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UserCmd {
    @Data
    @Schema(name = "UserCmd$updateUserCmd")
    public static class updateUserCmd {

        private String username;

        private String signature;
    }
}
