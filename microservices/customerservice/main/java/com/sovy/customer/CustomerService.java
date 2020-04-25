/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sovy.customer;

/**
 *
 * @author Lenovo
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stefan.tomasik
 */
@Service
public class CustomerService {

    @Autowired
    CustomerRepository repository;

    public Customer createCustomer(Customer entity) throws CustomerException {

        if (entity == null) {
            throw new CustomerException(ErrorMessages.INTERNAL_SERVER_ERROR.getErrorMessage());
        } else {
            Customer newEntity = repository.save(entity);
            return newEntity;
        }
    }

    public void updateCustomer(Customer entity) {
        Customer customer = repository.findOne(entity.getId());
        repository.save(customer);
    }

    public Customer getCustomer(Long id) {
        Customer customer = repository.findOne(id);
        
        if (customer == null) {
            throw new CustomerException(ErrorMessages.INTERNAL_SERVER_ERROR.getErrorMessage());
        } 
        else return customer;
    }
    /*
    public void deleteCustomer(Long id) {
        repository.deleteById(id);
    }
     */
}
