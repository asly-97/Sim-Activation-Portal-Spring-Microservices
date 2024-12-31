package com.simactivation.portal.CustomerService.utility;

import java.time.LocalDateTime;

public class ErrorInfo {
    private String message;
    private Integer httpStatusCode;
    private LocalDateTime timestamp;

    public ErrorInfo() {
    }

    public ErrorInfo(String message, Integer httpStatusCode, LocalDateTime timestamp) {
        this.message = message;
        this.httpStatusCode = httpStatusCode;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
