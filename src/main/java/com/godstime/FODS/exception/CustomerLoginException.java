package com.godstime.FODS.exception;

import java.io.Serial;

public class CustomerLoginException extends Exception {
    @Serial
    private static final long serialVersionUID =1L;

    public CustomerLoginException() {
    }

    public CustomerLoginException(String message) {
        super(message);
    }

}
