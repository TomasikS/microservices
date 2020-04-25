/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sovy.customer;

import javax.ws.rs.ext.Provider;

/**
 *
 * @author Lenovo
 */
@Provider
public class CustomerException
        extends RuntimeException {

    public CustomerException(String message) {
        super(message);
    }

}
