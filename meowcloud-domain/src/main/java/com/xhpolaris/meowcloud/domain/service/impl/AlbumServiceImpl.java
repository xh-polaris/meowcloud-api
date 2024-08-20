package com.xhpolaris.meowcloud.domain.service.impl;

import com.xhpolaris.meowcloud.common.model.cmd.AlbumCmd;
import com.xhpolaris.meowcloud.common.model.vo.album.AlbumBasicVO;
import com.xhpolaris.meowcloud.common.model.vo.album.AlbumDetailVO;
import com.xhpolaris.meowcloud.common.model.vo.album.AlbumInfoVO;
import com.xhpolaris.meowcloud.domain.rpc.AlbumRpc;
import com.xhpolaris.meowcloud.domain.service.AlbumService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
public class AlbumServiceImpl implements AlbumService {

    private final AlbumRpc albumRpc;

    @Override
    public List<AlbumBasicVO> getCatAlbum(Integer albumType) {
        // TODO 调用rpc获取猫猫相册详情
        return null;
    }

    @Override
    public boolean createCatAlbum(AlbumCmd.CreateCatAlbumCmd cmd) {
        // TODO 调用rpc创建猫猫相册
        return false;
    }

    @Override
    public AlbumInfoVO getCatAlbumInfo(String id) {
        // TODO 调用rpc 获取猫猫相册信息
        return null;
    }

    @Override
    public boolean updateAlbumInfo(AlbumCmd.UpdateCatAlbumInfoCmd cmd) {
        // TODO 调用rpc 更新相册信息
        return false;
    }

    @Override
    public AlbumDetailVO getCatAlbumDetail(String id) {
        // TODO 调用rpc，获取相册细节信息展示
        return null;
    }
}
