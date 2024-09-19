package com.xhpolaris.meowcloud.domain.service.impl;

import com.xhpolaris.meowcloud.common.model.cmd.AlbumCmd;
import com.xhpolaris.meowcloud.common.model.vo.CatVO;
import com.xhpolaris.meowcloud.common.model.vo.album.AlbumBasicVO;
import com.xhpolaris.meowcloud.common.model.vo.album.AlbumDetailVO;
import com.xhpolaris.meowcloud.common.model.vo.album.AlbumInfoVO;
import com.xhpolaris.meowcloud.domain.service.AlbumService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class AlbumServiceImpl implements AlbumService {
    @Override
    public List<AlbumBasicVO> getCatAlbum(int pageSize, int pageNum) {
        return List.of(new AlbumBasicVO("个人相册id123456789", "个人相册test01", 123L, "https://cdn.oaistatic.com/assets/favicon-32x32-frb1kl3v.webp"));
    }

    @Override
    public List<AlbumBasicVO> getTeamCatAlbum(Integer id, int pageSize, int pageNum) {
        return List.of(new AlbumBasicVO("团队id" + id, "团队相册test01", 123L, "https://cdn.oaistatic.com/assets/favicon-32x32-frb1kl3v.webp"));
    }

    @Override
    public boolean createCatAlbum(AlbumCmd.CreateCatAlbumCmd cmd) {
        return true;
    }

    @Override
    public AlbumInfoVO getCatAlbumInfo(String id) {
        return new AlbumInfoVO("123456789", "test01", "https://cdn.oaistatic.com/assets/favicon-32x32-frb1kl3v.webp", true, "测试相册", new CatVO(
                "cat123", "小猫", 12L, "家养猫", "奶牛猫", "大草坪", "别碰，咬人"
        ));
    }

    @Override
    public boolean updateAlbumInfo(AlbumCmd.UpdateCatAlbumInfoCmd cmd) {
        return true;
    }

    @Override
    public AlbumDetailVO getCatAlbumDetail(String id) {
        return new AlbumDetailVO("123456789", "test01", "https://cdn.oaistatic.com/assets/favicon-32x32-frb1kl3v.webp", true, "测试用的相册", new CatVO(
                "cat123", "小猫", 12L, "家养猫", "奶牛猫", "大草坪", "别碰，咬人"
        ), 123L, 123L, 123L);
    }

//    private final AlbumRpc albumRpc;
//
//    @Override
//    public List<AlbumBasicVO> getCatAlbum(Integer albumType) {
//        // TODO 调用rpc获取猫猫相册详情
//        return null;
//    }
//
//    @Override
//    public boolean createCatAlbum(AlbumCmd.CreateCatAlbumCmd cmd) {
//        // TODO 调用rpc创建猫猫相册
//        return false;
//    }
//
//    @Override
//    public AlbumInfoVO getCatAlbumInfo(String id) {
//        // TODO 调用rpc 获取猫猫相册信息
//        return null;
//    }
//
//    @Override
//    public boolean updateAlbumInfo(AlbumCmd.UpdateCatAlbumInfoCmd cmd) {
//        // TODO 调用rpc 更新相册信息
//        return false;
//    }
//
//    @Override
//    public AlbumDetailVO getCatAlbumDetail(String id) {
//        // TODO 调用rpc，获取相册细节信息展示
//        return null;
//    }
}
