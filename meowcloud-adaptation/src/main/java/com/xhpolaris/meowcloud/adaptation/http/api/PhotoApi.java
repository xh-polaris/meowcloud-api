package com.xhpolaris.meowcloud.adaptation.http.api;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;

@Tag(name = "PhotoApi",description = "相片相关接口")
@RequestMapping("/api/photo")
public interface PhotoApi {
}
