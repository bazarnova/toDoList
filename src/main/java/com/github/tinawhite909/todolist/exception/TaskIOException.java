package com.github.tinawhite909.todolist.exception;


public class TaskIOException extends RuntimeException {
    public TaskIOException() {
    }

    public TaskIOException(String message) {
        super(message);
    }

    public TaskIOException(String message, Throwable cause) {
        super(message, cause);
    }

    public TaskIOException(Throwable cause) {
        super(cause);
    }

    public TaskIOException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
