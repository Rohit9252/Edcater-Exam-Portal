package com.exam.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> myExceptionHandler(Exception ie) {

        return new ResponseEntity<String>(ie.getMessage(), HttpStatus.BAD_REQUEST);

    }


  @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<MyErrorDetails> myExceptionHandler(UserNotFoundException ie) {

        MyErrorDetails myErrorDetails = new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), "From myExceptionHandler");

        return new ResponseEntity<MyErrorDetails>(myErrorDetails, HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<MyErrorDetails> myExceptionHandler(NoHandlerFoundException ie) {

        MyErrorDetails myErrorDetails = new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), "From myExceptionHandler");

        return new ResponseEntity<MyErrorDetails>(myErrorDetails, HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(UserFoundException.class)
    public ResponseEntity<MyErrorDetails> myExceptionHandler(UserFoundException ie) {

        MyErrorDetails myErrorDetails = new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), "From myExceptionHandler");

        return new ResponseEntity<MyErrorDetails>(myErrorDetails, HttpStatus.NOT_FOUND);

    }




}
