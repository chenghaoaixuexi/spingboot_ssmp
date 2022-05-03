package com.ch.springboot_08_ssmp.controller.util;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author chenghao
 * @purpose：
 * @备注：
 * @data 2022年05月03日 22:38
 */

//作为springMVC的异常处理器
//@ControllerAdvice
@RestControllerAdvice
public class ProjectEception {

    //拦截所有异常信息
    @ExceptionHandler
    public R doEception(Exception e){

        //在后台打印记录异常
        e.printStackTrace();
        return new R("服务器异常，请稍后再试");
    }
}
