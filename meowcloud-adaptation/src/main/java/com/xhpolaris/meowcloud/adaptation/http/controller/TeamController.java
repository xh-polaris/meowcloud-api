package com.xhpolaris.meowcloud.adaptation.http.controller;

import com.xhpolaris.meowcloud.adaptation.http.api.TeamApi;
import com.xhpolaris.meowcloud.common.model.vo.TeamVO;
import com.xhpolaris.meowcloud.domain.service.TeamService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class TeamController implements TeamApi {

    private final TeamService teamService;

    @Override
    public List<TeamVO> getTeams(int pageNum, int pageSize) {
        return teamService.getTeams(pageSize,pageNum);
    }
}
