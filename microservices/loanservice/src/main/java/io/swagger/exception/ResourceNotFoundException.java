/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.swagger.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Lenovo
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception {
    private static final long serialVersionUID = -9079454849611061074L;

	public ResourceNotFoundException(String message){
        super(message);
    }

   public ResourceNotFoundException() {
        super();
    }
}
