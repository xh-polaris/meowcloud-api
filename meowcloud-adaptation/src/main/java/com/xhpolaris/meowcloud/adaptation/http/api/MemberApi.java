package com.xhpolaris.meowcloud.adaptation.http.api;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;

@Tag(name = "MemberApi",description = "会员相关接口")
@RequestMapping("/api/member")
public interface MemberApi {
}
