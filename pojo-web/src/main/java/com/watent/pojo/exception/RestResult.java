package com.watent.pojo.exception;

import lombok.Data;

@Data
public class RestResult<T> {

    /**
     * 结果true/false
     */
    private Boolean result;
    /**
     * 消息
     */
    private String msg;
    /**
     * 响应码
     */
    private String code;
    /**
     * 数据
     */
    private T data;

    private RestResult() {
    }

    private static <T> RestResult<T> newInstance() {
        return new RestResult<>();
    }

    private static <T> RestResult<T> newInstance(Boolean result, String msg, String code, T data) {
        RestResult<T> restResult = RestResult.newInstance();
        restResult.setResult(result);
        restResult.setMsg(msg);
        restResult.setCode(code);
        restResult.setData(data);
        return restResult;
    }

    private static <T> RestResult<T> newInstance(Boolean result, String msg, String code) {

        RestResult<T> restResult = RestResult.newInstance();
        restResult.setResult(result);
        restResult.setMsg(msg);
        restResult.setCode(code);
        return restResult;
    }

    public static <T> RestResult<T> genSuccessResult() {
        return newInstance(Boolean.TRUE, null, null);
    }

    public static <T> RestResult<T> genSuccessResult(String msg) {
        return newInstance(Boolean.TRUE, msg, null);
    }

    public static <T> RestResult<T> genSuccessResult(ErrorCode errorCode) {
        return newInstance(Boolean.TRUE, errorCode.getMsg(), errorCode.getCode());
    }

    public static <T> RestResult<T> genSuccessResult(T data) {
        return newInstance(Boolean.TRUE, null, null, data);
    }


    public static <T> RestResult<T> genErrorResult(String msg) {
        return newInstance(Boolean.FALSE, msg, null);
    }

    public static <T> RestResult<T> genErrorResult(ErrorCode errorCode) {
        return newInstance(Boolean.FALSE, errorCode.getMsg(), errorCode.getCode());
    }

    public static <T> RestResult<T> genErrorResult(String msg, T data) {
        return newInstance(Boolean.FALSE, msg, null, data);
    }

}

