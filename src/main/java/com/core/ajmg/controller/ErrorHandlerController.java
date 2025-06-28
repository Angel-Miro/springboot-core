package com.core.ajmg.controller;

import com.core.ajmg.dto.Error;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ErrorHandlerController {

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<Error> genericResponse(Exception ex) {
        return ResponseEntity.badRequest().body(new Error(400, "Error en el parametro", LocalDateTime.now()));
    }

}
