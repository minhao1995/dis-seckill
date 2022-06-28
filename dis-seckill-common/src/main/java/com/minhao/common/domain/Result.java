package com.minhao.common.domain;

public class  Result<T> {

    private int code;
    private String message;
    private T data;

    public Result() {
    }

    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T>Result<T> success(T data) {
        return new Result<>(ErrorCodeEnum.SUCCESS.getCode(), MessageEnum.SUCCESS.getMessage(),data);
    }

    public static <T>Result<T> success(String message,T data) {
        return new Result<>(ErrorCodeEnum.SUCCESS.getCode(), message,data);
    }

    public static <T> Result<T> fail(int code ,String message) {
        return new Result<>(code,message,null);
    }

    public static <T> Result<T> fail(String message) {
        return fail(ErrorCodeEnum.FAIL.getCode(), message);
    }
}
