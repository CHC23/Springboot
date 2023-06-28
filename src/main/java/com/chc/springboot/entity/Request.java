package com.chc.springboot.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Request<T> implements Serializable {
    /**
     * 当前页 默认1
     */
    private int page;


    /**
     * 每页的数量 默认10
     */
    private int rows;

    /**
     * 请求参数
     */
    private T data;

    public int getPage() {
        return page > 0 ? page : 1;
    }
    public int getRows() {
        return rows > 0 ? rows : 10;
    }
}
