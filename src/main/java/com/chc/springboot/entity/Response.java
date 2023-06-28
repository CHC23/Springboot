package com.chc.springboot.entity;

import com.chc.springboot.common.enums.ErrorMessage;
import lombok.Data;

import java.io.Serializable;

@Data
public class Response<T> implements Serializable {

    private Integer code;

    private String message;

    private T data;

    private Response(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private Response(ErrorMessage errorMessage) {
        this.code = errorMessage.getCode();
        this.message = errorMessage.getMessage();
    }

    private Response(ErrorMessage errorMessage, T data) {
        this.code = errorMessage.getCode();
        this.message = errorMessage.getMessage();
        this.data = data;
    }


    public static <T> Response<T> success(){
        return new Response<>(ErrorMessage.SUCCESS);
    }

    public static <T> Response<T> success(T data){
        return new Response<>(ErrorMessage.SUCCESS,data);
    }

    public static <T> Response<T> fail(ErrorMessage errorMessage) {
        return new Response<>(errorMessage);
    }

    public static <T> Response<T> fail(ErrorMessage errorMessage, T data) {
        return new Response<>(errorMessage, data);
    }

    public static <T> Response<T> fail(int code, String msg) {
        return new Response<>(code, msg);
    }
}
