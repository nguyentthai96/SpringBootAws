package com.blog.samples.boot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND) // 404
    @ExceptionHandler(CustomerNotFoundException.class)
    public void handleNotFound(CustomerNotFoundException ex) {
        System.out.println("Resource not found");
//        log.error("Resource not found");
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST) // 400
    @ExceptionHandler(InvalidCustomerRequestException.class)
    public void handleBadRequest(InvalidCustomerRequestException ex) {
        System.out.println("Invalid Fund Request");
//        log.error("Invalid Fund Request");
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) // 500
    @ExceptionHandler(Exception.class)
    public void handleGeneralError(Exception ex) {
        System.out.println("An error occurred procesing request" + ex);
//        log.error("An error occurred procesing request", ex);
    }
}
