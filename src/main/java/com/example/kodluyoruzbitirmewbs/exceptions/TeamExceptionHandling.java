package com.example.kodluyoruzbitirmewbs.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


//team exception
@RestControllerAdvice
public class TeamExceptionHandling {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> methodExceptionHandler(Exception e){
        String exceptionMessage = "Exception "+ e.getMessage();
        return new ResponseEntity<String>(exceptionMessage, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
