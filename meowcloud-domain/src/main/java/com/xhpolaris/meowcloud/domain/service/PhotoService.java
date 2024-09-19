package com.xhpolaris.meowcloud.domain.service;

import com.xhpolaris.meowcloud.common.model.vo.PhotoDetailVO;
import com.xhpolaris.meowcloud.common.model.vo.PhotoVO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PhotoService {
    List<PhotoVO> getAll(int pageSize,int pageNum);

    List<PhotoVO> getPhotoByAlbum(String id);

    PhotoDetailVO getPhotoDetail(String id);
}
