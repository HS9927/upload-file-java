package com.spring.samplespringproject.helper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ObjResponseEntity<T> {

    @JsonProperty("timestamp")
    private long timestamp;
    @JsonProperty("success")
    private boolean success;
    @JsonProperty("message")
    private String message;
    @JsonProperty("code")
    private int code;
    @JsonProperty("data")
    private T data;

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
