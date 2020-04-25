/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.swagger.exception;

import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Lenovo
 */

@ControllerAdvice
public class LoanExceptionController {
  @ExceptionHandler(LoanException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public @ResponseBody
    ExceptionResponse handleResourceNotFound(final LoanException exception,
            final HttpServletRequest request) {

        ExceptionResponse error = new ExceptionResponse();
        error.setErrorMessage(exception.getMessage());
        error.callerURL(request.getRequestURI());

        return error;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public @ResponseBody
    ExceptionResponse handleException(final Exception exception,
            final HttpServletRequest request) {

        ExceptionResponse error = new ExceptionResponse();
        error.setErrorMessage(exception.getMessage());
        error.callerURL(request.getRequestURI());

        return error;
    }}
