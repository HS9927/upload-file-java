package com.spring.samplespringproject.helper;

public enum ErrorMessage {
    /// Pre-Define Error Message to use in Project
    NOT_FOUND("Page not found"), INTERNAL_ERROR("Internal Server Error"), NULL_POINTER("Null Pointer Exception!");

    private String value;

    private ErrorMessage(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
