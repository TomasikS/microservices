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


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author stefan.tomasik
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}