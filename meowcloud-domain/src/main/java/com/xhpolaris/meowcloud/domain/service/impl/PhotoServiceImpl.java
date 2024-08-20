package com.xhpolaris.meowcloud.domain.service.impl;

import com.xhpolaris.meowcloud.common.model.vo.PhotoDetailVO;
import com.xhpolaris.meowcloud.common.model.vo.PhotoVO;
import com.xhpolaris.meowcloud.domain.rpc.PhotoRpc;
import com.xhpolaris.meowcloud.domain.service.PhotoService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PhotoServiceImpl implements PhotoService {

    private final PhotoRpc photoRpc;

    @Override
    public List<PhotoVO> getAll() {
        // TODO 获取所有相册
        return null;
    }

    @Override
    public List<PhotoVO> getPhotoByAlbum(String id) {
        // TODO 根据相册获取所有照片
        return null;
    }

    @Override
    public PhotoDetailVO getPhotoDetail(String id) {
        // TODO 获取照片细节
        return null;
    }
}
