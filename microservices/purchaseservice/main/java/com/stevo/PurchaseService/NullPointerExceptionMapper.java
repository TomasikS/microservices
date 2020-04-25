/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stevo.PurchaseService;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Lenovo
 */
@Provider
public class NullPointerExceptionMapper
    implements ExceptionMapper<NullPointerException> {

  @Override
  public Response toResponse(NullPointerException e) {
    return Response.status(Response.Status.NOT_FOUND).build();
  }
}
