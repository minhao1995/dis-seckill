package com.minhao.common.domain;


public enum ErrorCodeEnum {
    SUCCESS(0),
    FAIL(500);

    private int code;

    ErrorCodeEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
