package com.spring.samplespringproject.helper;

import org.springframework.http.HttpStatus;

public class AjaxMessage {

    private HttpStatus status;
    private boolean result;
    private String title;
    private String detail;

    @Override
    public String toString() {
        return "AjaxMessage [status=" + status + ", result=" + result + ", title=" + title + ", defailt=" + detail
                + "]";
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

}
