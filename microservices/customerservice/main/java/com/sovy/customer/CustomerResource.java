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



import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

@Path("/customers")
public class CustomerResource {
    
   
    @Autowired
    CustomerService db;
    
   
 

    @Path("customer/{id}")
    @PUT
    public Response updateCustomer(Customer customer)   {
        
          if(customer==null)  throw new CustomerException(ErrorMessages.INTERNAL_SERVER_ERROR.getErrorMessage());
          else {
        db.updateCustomer(customer);
        return Response.status(200).build();
    }}

    @Path("/add")
    @POST
    public void createCustomer(Customer json) throws CustomerException  {
        if(json==null)  throw new CustomerException(ErrorMessages.INTERNAL_SERVER_ERROR.getErrorMessage());
        else {
        db.createCustomer(json);
        //return Response.status(200).build();
    }}

    @GET
    @Path("customer/{id}")
    @Produces("application/json")
    public Response getCustomerById(@PathParam("id") Long id) throws CustomerException {
        Customer customer = null;
        customer = db.getCustomer(id);
        if (customer == null) {
          //  return Response.status(404).build();
          
          throw new CustomerException(ErrorMessages.INTERNAL_SERVER_ERROR.getErrorMessage());
          
        }
        return Response
                .status(200)
                .entity(customer)
                .build();
    }

  /*  @DELETE
    @Path("customer/{id}")
    public Response deleteCustomerById(@PathParam("id") Long id) {
        Customer customer = null;
        db.deleteCustomer(id);
        return Response
                .status(200)
                .entity(customer)
                .build();
    }*/

}
