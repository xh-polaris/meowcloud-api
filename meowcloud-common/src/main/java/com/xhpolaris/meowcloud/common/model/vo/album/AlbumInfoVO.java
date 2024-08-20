package com.xhpolaris.meowcloud.common.model.vo.album;

import com.xhpolaris.meowcloud.common.model.vo.CatVO;
import lombok.Data;

@Data
public class AlbumInfoVO {
    // 相册id
    private String id;
    // 相册名
    private String name;
    // 封面
    private String cover;
    // 可见性
    private boolean isPublic;
    // 相册描述
    private String description;
    // 猫猫信息
    private CatVO cat;
}
