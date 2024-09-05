package com.xhpolaris.meowcloud.domain.service.impl;

import com.xhpolaris.meowcloud.common.model.vo.TeamVO;
import com.xhpolaris.meowcloud.domain.service.TeamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {
    @Override
    public List<TeamVO> getTeams() {
        // TODO 调用rpc获取团队信息
        return List.of(new TeamVO("团队id1","团队名1"),new TeamVO("团队id2","团队名2"),new TeamVO("团队id3","团队名3"));
    }
}
