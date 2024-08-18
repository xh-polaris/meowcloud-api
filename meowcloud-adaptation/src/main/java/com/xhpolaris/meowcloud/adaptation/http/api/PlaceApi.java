package com.xhpolaris.meowcloud.adaptation.http.api;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;

@Tag(name = "PlaceApi",description = "地点相关接口")
@RequestMapping("/api/Place")
public interface PlaceApi {
}
