package com.exam.exception;

public class UserFoundException extends RuntimeException{

    public UserFoundException() {
        super("User with this Username is already there in DB !! try with another one");
    }

    public UserFoundException(String msg)
    {
        super(msg);
    }
}
