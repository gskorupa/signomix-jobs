package com.signomix.jobs.application.exception;

public class ErrorMessage {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorMessage(String message) {
        super();
        this.message = message;
    }

    public ErrorMessage() {
        super();
    }
}
