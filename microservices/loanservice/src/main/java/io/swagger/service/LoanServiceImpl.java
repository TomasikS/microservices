/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.swagger.service;

import io.swagger.model.Loan;
import io.swagger.repository.LoanRepository;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Lenovo
 */

@Service
public class LoanServiceImpl implements LoanService {
    
    @Autowired
    private LoanRepository service;
    
    PomDatabase database = new PomDatabase();
    
    @Override
    public Loan addCheckout(Loan checkout) {
        return service.save(checkout);
    }
    
    @Override
    public Loan updateCheckout(Loan checkout) {
        checkout = service.findById(checkout.getId()).get();
        return service.save(checkout);
    }
    
    @Override
    public Loan getCheckoutById(long id) {
        List idUser = new ArrayList();
        List idBook = new ArrayList();
        Loan petObject = new Loan();
        try {
            idUser = database.getUserById();
            idBook = database.getBookById();
            
        } catch (IOException ex) {
            Logger.getLogger(LoanServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoanServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoanServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Loan pet = service.findById(id).get();
        
        int index1 = -1;
        int index2 = -1;
        
        for (int i = 0; i < idUser.size(); i++) {
            if (idUser.get(i) == (pet.getIdUser())) {
                index1 = 0;
            }
            
        }
        
        for (int i = 0; i < idBook.size(); i++) {
            if (idBook.get(i) == (pet.getIdBook())) {
                index2 = 0;
            }
            
        }
        
        if ((index1 == 0) && (index2 == 0)) {
            petObject = pet;
        }
        petObject.setId(pet.getId());
        petObject.setDatumpozicania(pet.getDatumpozicania());
        petObject.setDatumvratenia(pet.getDatumvratenia());
        petObject.setMaxdatum(pet.getMaxdatum());
        petObject.setNote(pet.getNote());
        petObject.setName(pet.getName());
        petObject.setIdBook(pet.getIdBook());
        petObject.setIdUser(pet.getIdUser());
        return petObject;
    }
    
    @Override
    public void deleteCheckout(long id) {
        service.deleteById(id);
    }
    
}
