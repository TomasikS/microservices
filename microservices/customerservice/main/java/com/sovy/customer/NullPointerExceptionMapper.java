/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sovy.customer;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Lenovo
 */
@Provider
public class NullPointerExceptionMapper
        implements ExceptionMapper<CustomerException> {

    @Override
    public Response toResponse(CustomerException exception) {
        ErrorMessage errorMessage = new ErrorMessage(
                exception.getMessage(),
                ErrorMessages.INTERNAL_SERVER_ERROR.name()
        );

        return Response.status(Response.Status.BAD_REQUEST).type(MediaType.APPLICATION_JSON).
                entity(errorMessage).
                build();

    }
}
