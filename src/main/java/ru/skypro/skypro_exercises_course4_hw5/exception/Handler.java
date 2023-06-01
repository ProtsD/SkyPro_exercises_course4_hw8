package ru.skypro.skypro_exercises_course4_hw5.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class Handler {
    @ExceptionHandler
    public ResponseEntity<?> handlerSQLException(IndexOutOfBoundsException indexOutOfBoundsException) {
        return new ResponseEntity<>("Index out of bounds", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<?> handlerNumberFormatException(NumberFormatException numberFormatException) {
        return new ResponseEntity<>("Wrong number format", HttpStatus.BAD_REQUEST);
    }
}
