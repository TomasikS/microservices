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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author stefan.tomasik
 */
@Entity
@Table(name = "settings")
public class Settings implements Serializable {

      @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "id")
          @Column(name = "details_id")
    private Long id;

    public Settings() {
    }

    @Column(name = "preferedLang")
    String preferedLang;

    @Column(name = "mena")
    String mena;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPreferedLang() {
        return preferedLang;
    }

    public void setPreferedLang(String preferedLang) {
        this.preferedLang = preferedLang;
    }

    public String getMena() {
        return mena;
    }

    public void setMena(String mena) {
        this.mena = mena;
    }

}
