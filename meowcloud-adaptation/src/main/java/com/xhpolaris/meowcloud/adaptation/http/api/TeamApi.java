package com.xhpolaris.meowcloud.adaptation.http.api;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;

@Tag(name = "TeamApi", description = "团队接口")
@RequestMapping("/api/team")
public interface TeamApi {
}
