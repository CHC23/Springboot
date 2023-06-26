package com.chc.springboot.common.excption;

import com.chc.springboot.common.enums.ErrorMessage;
import lombok.Getter;

@Getter
public class CustomException extends RuntimeException{
    private final int code;
    private final String message;

    public CustomException(int code,String message){
        this.code = code;
        this.message = message;
    }

    public CustomException(ErrorMessage errorMessage){
        this(errorMessage.getCode(), errorMessage.getMessage());
    }
}
