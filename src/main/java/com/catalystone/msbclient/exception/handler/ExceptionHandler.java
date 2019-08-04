package com.catalystone.msbclient.exception.handler;

import com.catalystone.msbclient.exception.UserNotFoundException;
import com.catalystone.msbclient.util.Views;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler({UserNotFoundException.class})
    public String handleUserException(UserNotFoundException e) {
        return Views.ERROR.getView();
    }

}
