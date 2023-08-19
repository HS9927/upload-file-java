package com.spring.samplespringproject.helper;

public enum MessageEnum {
    NO_DATA("No data found"),
    INTERNAL_SERVER_ERROR("Internal server error"),
    REQUEST_MESSAGE_MANDATORY("RequestMessage is mandatory"),
    SUCCESSED(""),
    SERVICE_HEADER_MANDATORY("ServiceHeader is mandatory");

    // private TrayIcon.MessageType type;

    private String text;

    public String getText() {
        return text;
    }

    public static MessageEnum fromText(String text) {
        if (text != null) {
            for (MessageEnum message : values()) {
                if (message.getText().equals(text)) {
                    return message;
                }
            }
        }
        return null;
    }

    private MessageEnum(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
