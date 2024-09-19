package com.xhpolaris.meowcloud.adaptation.http.controller;

import com.xhpolaris.meowcloud.adaptation.http.api.PhotoApi;
import com.xhpolaris.meowcloud.common.model.vo.PhotoDetailVO;
import com.xhpolaris.meowcloud.common.model.vo.PhotoVO;
import com.xhpolaris.meowcloud.domain.service.PhotoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class PhotoController implements PhotoApi {

    private final PhotoService photoService;

    @Override
    public List<PhotoVO> getAll(int pageSize,int pageNum) {
        return photoService.getAll(pageSize,pageNum);
    }

    @Override
    public List<PhotoVO> getPhotoByAlbum(String id) {
        return photoService.getPhotoByAlbum(id);
    }

    @Override
    public PhotoDetailVO getPhotoDetail(String id) {
        return photoService.getPhotoDetail(id);
    }
}
