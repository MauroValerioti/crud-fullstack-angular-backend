package com.AngularProyect.Fullstack.crudfullstackangular.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@ControllerAdvice //interceptara todas las peticiones que haga el cliente al backend
public class GlobalExCeptionHandler {

    @ExceptionHandler(ResourceNotFoundExeption.class) //tipo de excepcion que voy a lanzar
    public ResponseEntity<ErrorDetails> handleResourceNotFoundException(ResourceNotFoundExeption ex,
                                                                         WebRequest webRequest){
        ErrorDetails error = new ErrorDetails(
                LocalDateTime.now(),
        ex.getMessage(),
        webRequest.getDescription(false),
        "NOT_FOUND" //codigo de error que quiero que muestre
                );
    return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
