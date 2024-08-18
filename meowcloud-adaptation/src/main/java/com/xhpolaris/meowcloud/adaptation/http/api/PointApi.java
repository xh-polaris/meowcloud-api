package com.xhpolaris.meowcloud.adaptation.http.api;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;

@Tag(name = "PointApi",description = "积分相关接口")
@RequestMapping("/api/point")
public interface PointApi {
}
