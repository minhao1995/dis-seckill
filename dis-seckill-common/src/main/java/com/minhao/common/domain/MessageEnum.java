package com.minhao.common.domain;

public enum MessageEnum {
    SUCCESS("请求成功"),
    FAIL("请求失败");

    private String message;

    MessageEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
