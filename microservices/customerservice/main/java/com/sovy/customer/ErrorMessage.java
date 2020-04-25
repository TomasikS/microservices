/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sovy.customer;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lenovo
 */
@XmlRootElement
public class ErrorMessage {
    private String errorMessageValue;
    private String errorMessageKey;
    
    public ErrorMessage() {}
    
    public ErrorMessage(String errorMessageValue, String errorMessageKey)
    {
        this.errorMessageValue = errorMessageValue;
        this.errorMessageKey = errorMessageKey;
    }
    /**
     * @return the errorMessageValue
     */
    public String getErrorMessageValue() {
        return errorMessageValue;
    }
    /**
     * @param errorMessageValue the errorMessageValue to set
     */
    public void setErrorMessageValue(String errorMessageValue) {
        this.errorMessageValue = errorMessageValue;
    }
    /**
     * @return the errorMessageKey
     */
    public String getErrorMessageKey() {
        return errorMessageKey;
    }
    /**
     * @param errorMessageKey the errorMessageKey to set
     */
    public void setErrorMessageKey(String errorMessageKey) {
        this.errorMessageKey = errorMessageKey;
    }
    
}
