package com.example.handler

import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import jakarta.validation.ConstraintViolationException;
import io.micronaut.http.annotation.Error;
import io.micronaut.http.HttpStatus
@Controller
class CustomGlobalExceptionHandler {

    @Error(global = true, exception = ConstraintViolationException.class)
    HttpResponse<Map<String, String>> handleConstraintViolation(HttpRequest request, ConstraintViolationException ex) {
        Map<String, String> errors = [:]
        ex.constraintViolations.each { violation ->
            String fieldName = violation.propertyPath.toString()
            String errorMessage = violation.message
            errors.put(fieldName, errorMessage)
        }
        return HttpResponse.status(HttpStatus.BAD_REQUEST).body(errors)
    }
}