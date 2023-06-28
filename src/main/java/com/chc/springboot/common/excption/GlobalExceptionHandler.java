package com.chc.springboot.common.excption;

import com.chc.springboot.common.enums.ErrorMessage;
import com.chc.springboot.entity.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = CustomException.class)
    public Response<Void> handler(CustomException e){
        log.error("自定义异常：",e);
        return Response.fail(e.getCode(),e.getMessage());
    }

    @ExceptionHandler(value = Exception.class)
    public Response<Void> handle(Exception e) {
        log.error("服务异常, message: {}", e.getMessage(), e);
        return Response.fail(ErrorMessage.SERVICE_ERROR);
    }
}
