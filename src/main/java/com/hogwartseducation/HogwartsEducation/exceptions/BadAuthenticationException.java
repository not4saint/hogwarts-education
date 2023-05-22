package com.hogwartseducation.HogwartsEducation.exceptions;

public class BadAuthenticationException extends RuntimeException {
    public BadAuthenticationException(String s) {
        super(s);
    }
}
