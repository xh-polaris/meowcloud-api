package com.xhpolaris.meowcloud.domain.service;

import com.xhpolaris.meowcloud.common.model.cmd.AlbumCmd;
import com.xhpolaris.meowcloud.common.model.vo.album.AlbumBasicVO;
import com.xhpolaris.meowcloud.common.model.vo.album.AlbumDetailVO;
import com.xhpolaris.meowcloud.common.model.vo.album.AlbumInfoVO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AlbumService {
    List<AlbumBasicVO> getCatAlbum(int pageSize,int pageNum);

    List<AlbumBasicVO> getTeamCatAlbum(Integer id,int pageSize,int pageNum);

    boolean createCatAlbum(AlbumCmd.CreateCatAlbumCmd cmd);

    AlbumInfoVO getCatAlbumInfo(String id);

    boolean updateAlbumInfo(AlbumCmd.UpdateCatAlbumInfoCmd cmd);

    AlbumDetailVO getCatAlbumDetail(String id);
}
