package com.xhpolaris.meowcloud.adaptation.http.api;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;

@Tag(name = "AchievementApi", description = "成就相关接口")
@RequestMapping("/api/achievement")
public interface AchievementApi {
}
