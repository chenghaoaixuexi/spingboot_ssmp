package com.ch.springboot_08_ssmp.controller.util;

import lombok.Data;

/**
 * @author chenghao
 * @purpose：
 * @备注：
 * @data 2022年05月02日 19:52
 */
@Data
public class R {
    private boolean flag;
    private Object data;
    private String message;

    public R() {
    }

    public R(boolean flag) {
        this.flag = flag;
    }

    public R(boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public R(String messsage) {
        this.message = messsage;
    }

    public R(boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }
}
