package com.xhpolaris.meowcloud.adaptation.http.api;

import com.xhpolaris.meowcloud.common.model.vo.PhotoDetailVO;
import com.xhpolaris.meowcloud.common.model.vo.PhotoVO;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Tag(name = "PhotoApi", description = "相片相关接口")
@RequestMapping("/api/photo")
public interface PhotoApi {

    // 获取根据时间顺序获取所有的相片
    @GetMapping("/{pageNum}/{pageSize}")
    List<PhotoVO> getAll(@PathVariable int pageNum,@PathVariable int pageSize);

    // 根据相册获取相片
    @GetMapping("/{id}")
    List<PhotoVO> getPhotoByAlbum(@PathVariable String id);

    // 获取相片详细信息
    @GetMapping("/detail/{id}")
    PhotoDetailVO getPhotoDetail(@PathVariable String id);

    // TODO 批量导入相片
}
