package com.tyz.rmi.core;

/**
 * 捕获由于类类型不合规而产生的异常
 * @author tyz
 */
public class ClassTypeException extends RuntimeException {
    public ClassTypeException() {
    }

    public ClassTypeException(String message) {
        super(message);
    }

    public ClassTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ClassTypeException(Throwable cause) {
        super(cause);
    }

    public ClassTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
