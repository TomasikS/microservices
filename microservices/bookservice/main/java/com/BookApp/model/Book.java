package com.BookApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "Book")
public class Book {

    public Book(String name, String autor, String zaner, String datumvydania, String vydavatelstvo, int pocetstran,
            String jazyk, String ISBN, String Popis, boolean dostupnost, int mnozstvonapredaj, int mnozstvonavypozicku, double cena) {

        this.name = name;
        this.autor = autor;
        this.zaner = zaner;
        this.datumvydania = datumvydania;
        this.vydavatelstvo = vydavatelstvo;
        this.pocetstran = pocetstran;
        this.jazyk = jazyk;
        this.ISBN = ISBN;
        this.Popis = Popis;
        this.dostupnost = dostupnost;
        this.mnozstvonapredaj = mnozstvonapredaj;
        this.mnozstvonavypozicku = mnozstvonavypozicku;
        this.cena = cena;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "autor")
    private String autor;
    @Column(name = "zaner")
    private String zaner;
    @Column(name = "datumvydania")
    private String datumvydania;
    @Column(name = "vydavatelstvo")
    private String vydavatelstvo;
    @Column(name = "pocetstran")
    private int pocetstran;
    @Column(name = "jazyk")
    private String jazyk;
    @Column(name = "ISBN")
    private String ISBN;
    @Column(name = "Popis")
    private String Popis;

    @Column(name = "dostupnost")
    private boolean dostupnost;

    @Column(name = "mnozstvonapredaj")
    private int mnozstvonapredaj;

    @Column(name = "mnozstvonavypozicku")
    private int mnozstvonavypozicku;

    @Column(name = "cena")
    private double cena;

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getZaner() {
        return zaner;
    }

    public void setZaner(String zaner) {
        this.zaner = zaner;
    }

    public String getDatumvydania() {
        return datumvydania;
    }

    public void setDatumvydania(String datumvydania) {
        this.datumvydania = datumvydania;
    }

    public String getVydavatelstvo() {
        return vydavatelstvo;
    }

    public void setVydavatelstvo(String vydavatelstvo) {
        this.vydavatelstvo = vydavatelstvo;
    }

    public int getPocetstran() {
        return pocetstran;
    }

    public void setPocetstran(int pocetstran) {
        this.pocetstran = pocetstran;
    }

    public String getJazyk() {
        return jazyk;
    }

    public void setJazyk(String jazyk) {
        this.jazyk = jazyk;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPopis() {
        return Popis;
    }

    public void setPopis(String Popis) {
        this.Popis = Popis;
    }

    public boolean isDostupnost() {
        return dostupnost;
    }

    public void setDostupnost(boolean dostupnost) {
        this.dostupnost = dostupnost;
    }

    public int getMnozstvonapredaj() {
        return mnozstvonapredaj;
    }

    public void setMnozstvonapredaj(int mnozstvonapredaj) {
        this.mnozstvonapredaj = mnozstvonapredaj;
    }

    public int getMnozstvonavypozicku() {
        return mnozstvonavypozicku;
    }

    public void setMnozstvonavypozicku(int mnozstvonavypozicku) {
        this.mnozstvonavypozicku = mnozstvonavypozicku;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
