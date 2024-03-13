package com.AngularProyect.Fullstack.crudfullstackangular.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND) //ver constantes disponibles para mensaje HTTP.
public class ResourceNotFoundExeption extends RuntimeException{
    private String message;
    public ResourceNotFoundExeption(String message){
        super(message);
        this.message = message;
    }

}
