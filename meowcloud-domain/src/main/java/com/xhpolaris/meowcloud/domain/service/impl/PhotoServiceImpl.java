package com.xhpolaris.meowcloud.domain.service.impl;

import com.xhpolaris.meowcloud.common.model.vo.PhotoDetailVO;
import com.xhpolaris.meowcloud.common.model.vo.PhotoVO;
import com.xhpolaris.meowcloud.domain.service.PhotoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PhotoServiceImpl implements PhotoService {
    @Override
    public List<PhotoVO> getAll() {
        return List.of(new PhotoVO("相册id1",LocalDate.now(),"上海市",true,false),new PhotoVO("相册id2",LocalDate.now(),"上海市",true,false));
    }

    @Override
    public List<PhotoVO> getPhotoByAlbum(String id) {
        return List.of(new PhotoVO("相册id1",LocalDate.now(),"上海市",true,false),new PhotoVO("相册id2",LocalDate.now(),"上海市",true,false));
    }

    @Override
    public PhotoDetailVO getPhotoDetail(String id) {
        return new PhotoDetailVO(id,LocalDate.now(),"上海市",true,false,"照片的描述",123L,123L);
    }

//    private final PhotoRpc photoRpc;
//
//    @Override
//    public List<PhotoVO> getAll() {
//        // TODO 获取所有相册
//        return null;
//    }
//
//    @Override
//    public List<PhotoVO> getPhotoByAlbum(String id) {
//        // TODO 根据相册获取所有照片
//        return null;
//    }
//
//    @Override
//    public PhotoDetailVO getPhotoDetail(String id) {
//        // TODO 获取照片细节
//        return null;
//    }
}
