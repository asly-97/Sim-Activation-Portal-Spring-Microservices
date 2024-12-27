package com.simactivation.portal.SimService.controller;

import com.simactivation.portal.SimService.exception.SimNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvisorController {

    @ExceptionHandler(SimNotFoundException.class)
    public ResponseEntity<String> exceptionHandler(SimNotFoundException e){
        return ResponseEntity.status(e.getStatus()).body(e.getMessage());
    }

}
