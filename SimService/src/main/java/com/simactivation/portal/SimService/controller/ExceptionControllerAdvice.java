package com.simactivation.portal.SimService.controller;

import com.simactivation.portal.SimService.exception.SAPException;
import com.simactivation.portal.SimService.exception.SimNotFoundException;
import com.simactivation.portal.SimService.utility.ErrorInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(SAPException.class)
    public ResponseEntity<ErrorInfo> exceptionHandler(SAPException e){

        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setMessage(e.getMessage());
        errorInfo.setHttpStatusCode(e.getHttpStatus().value());
        errorInfo.setTimestamp(LocalDateTime.now());

        return new ResponseEntity<>(errorInfo,e.getHttpStatus());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorInfo> validationException(MethodArgumentNotValidException e){

        ErrorInfo errorInfo = new ErrorInfo();
        String message = e.getAllErrors()
                .stream()
                .map(ObjectError::getDefaultMessage)
                .collect(Collectors.joining(","));

        errorInfo.setMessage(message);
        errorInfo.setHttpStatusCode(400);
        errorInfo.setTimestamp(LocalDateTime.now());

        return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
    }
}
