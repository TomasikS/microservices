/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stevo.PurchaseService;

/**
 *
 * @author Lenovo
 */
 

import java.io.Serializable;

//@Entity
//@Table(name = "nakup")
public class Purchase implements Serializable {

    Purchase(Long idd, String datumDodania, String datumObjednavky, String datumSplatnosti, 
            String sposobPlatby, Long idUser, Long idBook)
    {
       this.id=idd;
       this.datumDodania=datumDodania;
       this.datumObjednavky=datumObjednavky;
       this.datumSplatnosti=datumSplatnosti;
       this.sposobPlatby=sposobPlatby;
       this.idUser=idUser;
       this.idBook=idBook;
       
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Purchase() {
    }

//    @Id
//    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "datumObjednavky")
    private String datumObjednavky;

    public String getDatumDodania() {
        return datumDodania;
    }

    public void setDatumDodania(String datumDodania) {
        this.datumDodania = datumDodania;
    }

  //  @Column(name = "datumDodania")
    private String datumDodania;

    public String getDatumObjednavky() {
        return datumObjednavky;
    }

    public void setDatumObjednavky(String datumObjednavky) {
        this.datumObjednavky = datumObjednavky;
    }

  //  @Column(name = "datumSplatnosti")
    private String datumSplatnosti;

    public String getDatumSplatnosti() {
        return datumSplatnosti;
    }

    public void setDatumSplatnosti(String datumSplatnosti) {
        this.datumSplatnosti = datumSplatnosti;
    }

  //  @Column(name = "sposobPlatby")
    private String sposobPlatby;

    public String getSposobPlatby() {
        return sposobPlatby;
    }

    public void setSposobPlatby(String sposobPlatby) {
        this.sposobPlatby = sposobPlatby;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Long getIdBook() {
        return idBook;
    }

    public void setIdBook(Long idBook) {
        this.idBook = idBook;
    }

  //  @Column(name = "idUser")
    private Long idUser;

  //  @Column(name = "idBook")
    private Long idBook;


    
    
}

