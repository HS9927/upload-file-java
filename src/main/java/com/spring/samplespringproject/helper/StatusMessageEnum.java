package com.spring.samplespringproject.helper;

public enum StatusMessageEnum {

    /// 200
    OK(200), CREATED(201),
    ACCEPTED(202),
    NO_CONTENT(204),
    /// 400
    BAD_REQUEST(400),
    UNAUTHORIZED(401),
    FORIBIDDEN(403), NOT_FOUND(404), METHOD_NOT_ALLOW(405), NOT_ACCEPTABLE(406), CONFLICT(409), GONE(410),
    PERCONDITION_FAILED(412), UNSUPPORTED_MEDIA_TYPE(415)
    /// 500
    , INTERNAL_SERVER_ERROR(500),
    SERVICE_UNAVAILABLE(503);

    private final int statusCode;

    private StatusMessageEnum(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public static StatusMessageEnum fromText(int statusCode) {
        for (StatusMessageEnum code : values()) {
            if (code.getStatusCode() == statusCode) {
                return code;
            }
        }
        return null;
    }

}
