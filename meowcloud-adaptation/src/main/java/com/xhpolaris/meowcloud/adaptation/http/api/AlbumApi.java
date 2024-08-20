package com.xhpolaris.meowcloud.adaptation.http.api;

import com.xhpolaris.meowcloud.common.model.cmd.AlbumCmd;
import com.xhpolaris.meowcloud.common.model.vo.album.AlbumBasicVO;
import com.xhpolaris.meowcloud.common.model.vo.album.AlbumDetailVO;
import com.xhpolaris.meowcloud.common.model.vo.album.AlbumInfoVO;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "AlbumApi",description = "相册相关接口")
@RequestMapping("/api/album")
public interface AlbumApi {

    // 获取猫猫相册列表
    // TODO albumType改成枚举类型
    @GetMapping("/basic/{albumType}")
    List<AlbumBasicVO> getCatAlbum(@PathVariable Integer albumType);

    // TODO 新建猫猫相册
    @PostMapping
    boolean createCatAlbum(@RequestBody AlbumCmd.CreateCatAlbumCmd cmd);

    // 猫猫相册详情页
    @GetMapping("/{id}")
    AlbumDetailVO getCatAlbumDetail(@PathVariable String id);

    // 获取猫猫相册详细信息
    @GetMapping("/info/{id}")
    AlbumInfoVO getCatAlbumInfo(@PathVariable String id);

    // 更新猫猫相册详细信息
    @PostMapping("/info")
    boolean updateAlbumInfo(@RequestBody AlbumCmd.UpdateCatAlbumInfoCmd cmd);

}
