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
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
//@Table(name = "Pouzivatel")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public String getDatumregistracie() {
        return datumregistracie;
    }

    public void setDatumregistracie(String datumregistracie) {
        this.datumregistracie = datumregistracie;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRola() {
        return rola;
    }

    public void setRola(String rola) {
        this.rola = rola;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    @Column(name = "address")
    private String Address;

    @Column(name = "firstname")
    private String Firstname;

    @Column(name = "lastname")
    private String Lastname;

    @Column(name = "postalcode")
    private String Postalcode;

    @Column(name = "sex")
    private String Sex;

    @Column(name = "datumregistracie")
    private String datumregistracie;

    @Column(name = "email")
    private String email;

    @Column(name = "heslo")
    private String heslo;

    public String getHeslo() {
        return heslo;
    }

    public void setHeslo(String heslo) {
        this.heslo = heslo;
    }

    @Column(name = "rola")
    private String rola;

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public String getPostalcode() {
        return Postalcode;
    }

    public void setPostalcode(String Postalcode) {
        this.Postalcode = Postalcode;
    }
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "details_id")
    private Settings settings;

    //@OneToOne(cascade = CascadeType.ALL, mappedBy = "customer")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "detail_id")
    private Company company;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
  
        this.company = company;

    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {

        this.settings = settings;

    }

    public Customer() {
    }

}
