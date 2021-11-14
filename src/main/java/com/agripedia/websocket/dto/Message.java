package com.agripedia.websocket.dto;

public class Message {
    private String contentMessage;

    public Message() {
    }

    public Message(String contentMessage) {
        this.contentMessage = contentMessage;
    }

    public String getContentMessage() {
        return contentMessage;
    }

    public void setContentMessage(String contentMessage) {
        this.contentMessage = contentMessage;
    }
}
