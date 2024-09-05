package com.xhpolaris.meowcloud.common.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class PhotoDetailVO {
    private String id;

    private LocalDate date;

    private String area;

    private boolean select;

    private boolean due;

    private String description;

    private Long like;

    private Long comment;
}
