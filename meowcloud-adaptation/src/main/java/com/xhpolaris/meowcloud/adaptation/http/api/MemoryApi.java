package com.xhpolaris.meowcloud.adaptation.http.api;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;

@Tag(name = "MemoryApi",description = "存储相关接口")
@RequestMapping("/api/memory")
public interface MemoryApi {
}
