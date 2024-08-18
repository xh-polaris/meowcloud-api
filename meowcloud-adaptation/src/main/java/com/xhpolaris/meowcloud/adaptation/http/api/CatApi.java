package com.xhpolaris.meowcloud.adaptation.http.api;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;

@Tag(name = "CatApi",description = "猫猫相关接口")
@RequestMapping("/api/cat")
public interface CatApi {
}
