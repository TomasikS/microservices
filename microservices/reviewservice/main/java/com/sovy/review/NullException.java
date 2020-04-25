/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sovy.review;

import org.restlet.resource.Status;

/**
 *
 * @author Lenovo
 */
@Status(value = 400, serialize = true)
public class NullException extends RuntimeException {
    public NullException(String message, Exception e) {
        super(message, e);
    }
}
