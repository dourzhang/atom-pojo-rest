package com.watent.pojo.exception;

import lombok.Getter;

public enum ErrorCode {

    SYSTEM_ERROR("system error", "pojo-500"),

    POJO_ERROR("pojo error", "pojo-400");

    @Getter
    private String msg;

    @Getter
    private String code;

    ErrorCode(String msg, String code) {
        this.msg = msg;
        this.code = code;
    }


}
