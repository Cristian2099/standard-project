package com.cristiandev.standard_project.router;

import com.cristiandev.standard_project.exception.StandardProjectException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@ControllerAdvice
public class StandardProjectControllerAdvice {

    @ExceptionHandler(StandardProjectException.class)
    public ResponseEntity<StandardProjectException> handleStandardProjectException(StandardProjectException ex) {
        return new ResponseEntity<>(ex, ex.getHttpStatus());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Exception> handleGeneralException(Exception ex) {
        return new ResponseEntity<>(ex, INTERNAL_SERVER_ERROR);
    }

}
