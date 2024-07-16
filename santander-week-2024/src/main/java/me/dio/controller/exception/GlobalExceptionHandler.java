package me.dio.controller.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
   
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException businessException) {
        return new ResponseEntity<>(businessException.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
    }
    
    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException notFoundException) {
        return new ResponseEntity<>("Resource id not found", HttpStatus.NOT_FOUND);
    }    

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> handleUnexpectedExeception(Throwable unexpectedException) {
        return new ResponseEntity<>("Unexpected server error", HttpStatus.INTERNAL_SERVER_ERROR);
    }    

}
