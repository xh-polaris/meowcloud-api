package com.xhpolaris.meowcloud.common.model.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Schema(name = "照片简要信息")
public class PhotoVO {

    private String id;

    private LocalDate date;

    private String area;

    private boolean select;

    private boolean due;

}
