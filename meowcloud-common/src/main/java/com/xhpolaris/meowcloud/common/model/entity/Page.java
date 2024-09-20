package com.xhpolaris.meowcloud.common.model.entity;

import lombok.Data;

import java.util.List;

@Data
public class Page<T> {
    private int pageNum;
    private int pageSize;
    private int total;
    private List<T> result;
}
