package com.chc.springboot.common.enums;

/**
 * 自定义错误码以及消息
 */
public enum ErrorMessage {
    SUCCESS(0,"success"),

    PARAMS_ERROR(1001,"参数错误"),

    ;

    private final int code;
    private final String message;

    ErrorMessage(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
