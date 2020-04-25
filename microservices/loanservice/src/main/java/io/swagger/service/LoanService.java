/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.swagger.service;

import io.swagger.model.Loan;


/**
 *
 * @author Lenovo
 */
public interface LoanService {
    public Loan addCheckout(Loan book);

    Loan updateCheckout(Loan book);

    Loan getCheckoutById(long id);

    void deleteCheckout(long id);
}
