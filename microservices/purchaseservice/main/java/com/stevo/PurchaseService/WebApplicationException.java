/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stevo.PurchaseService;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

/**
 *
 * @author Lenovo
 */
public class WebApplicationException extends RuntimeException {

    WebApplicationException(Response.Status status) {
     status=Status.BAD_REQUEST;
    }

 
    
}
