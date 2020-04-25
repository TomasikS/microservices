/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stevo.PurchaseService;

import javax.ws.rs.core.Response;

/**
 *
 * @author Lenovo
 */
public interface ExceptionMapper<E extends Throwable> {
  Response toResponse(E exception);
}
