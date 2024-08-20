package com.xhpolaris.meowcloud.common.model.cmd;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AlbumCmd {

    @Data
    @Schema(name = "AlbumCmd$CreateCatAlbumCmd")
    public static class CreateCatAlbumCmd {
        // TODO 创建猫猫相册请求
        // TODO albumType转成枚举类型
        Integer albumType;

        String AlbumInfoId;

        String ownerId;

        boolean isPublic;

        // TODO 猫猫信息，地点信息的处理

        // TODO 封面处理
        String cover;
    }

    @Data
    @Schema(name = "AlbumCmd$UpdateCatAlbumInfoCmd")
    public static class UpdateCatAlbumInfoCmd {
        // TODO 修改猫猫相册信息请求

        String name;

        // TODO 封面处理
        String cover;

        boolean isPublic;

        String  description;

        // 猫猫信息
        CatCmd.UpdateCatCmd cat;
    }
}
