package com.miproyecto.miaplicacion;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import jakarta.validation.ConstraintViolationException;

@RestControllerAdvice // Este controlador "observa" todas las excepciones en tu aplicación
public class GlobalExceptionHandler {

    // Maneja errores de validación
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<String> handleValidationException(ConstraintViolationException ex) {
        return ResponseEntity.badRequest().body("Error de validación: " + ex.getMessage());
    }
}
