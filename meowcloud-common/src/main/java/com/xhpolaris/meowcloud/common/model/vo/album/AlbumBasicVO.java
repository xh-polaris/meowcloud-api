package com.xhpolaris.meowcloud.common.model.vo.album;

import lombok.Data;

@Data
public class AlbumBasicVO {

    // 相册id
    private String id;

    // 相册名
    private String name;

    // 相册相片总数
    private Long total;

    // 封面
    private String cover;
}
