package com.spring.model;

public class AppError {
    String message;
    int status;

    public AppError() {
    }

    public AppError(String message, int status){
        this.message=message;
        this.status=status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Error{" +
                "message='" + message + '\'' +
                ", status=" + status +
                '}';
    }
}
