package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.validation.annotation.Validated;

/**
 * Pet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-27T12:29:55.795Z")

@Entity
public class Loan implements Serializable {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatumpozicania() {
        return datumpozicania;
    }

    public void setDatumpozicania(String datumpozicania) {
        this.datumpozicania = datumpozicania;
    }

    public String getDatumvratenia() {
        return datumvratenia;
    }

    public void setDatumvratenia(String datumvratenia) {
        this.datumvratenia = datumvratenia;
    }

    public String getMaxdatum() {
        return maxdatum;
    }

    public void setMaxdatum(String maxdatum) {
        this.maxdatum = maxdatum;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @ApiModelProperty(notes = "The employee email id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @JsonProperty("id")
    private Long id = null;

    @ApiModelProperty(notes = "The employee email id")
    @JsonProperty("name")
    @Column(name = "name")
    private String name = null;

    @ApiModelProperty(notes = "The employee email id")
    @Column(name = "datumpozicania")
    @JsonProperty("datumpozicania")
    private String datumpozicania = null;

    @ApiModelProperty(notes = "The employee email id")
    @Column(name = "datumvratenia")
    @JsonProperty("datumvratenia")
    private String datumvratenia = null;

    @ApiModelProperty(notes = "The employee email id")
    @Column(name = "maxdatum")
    @JsonProperty("maxdatum")
    private String maxdatum = null;

    @ApiModelProperty(notes = "The employee email id")
    @Column(name = "note")
    @JsonProperty("note")
    private String note = null;

    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    @ApiModelProperty(notes = "The employee email id")
    @Column(name = "idbook")
    @JsonProperty("idbook")
    private Integer idBook;

    @ApiModelProperty(notes = "The employee email id")
    @Column(name = "idUser")
    @JsonProperty("idUser")
    private Integer idUser;

    /*  @ApiModelProperty(example = "doggie", required = true, value = "")

    public String getDatumpozicania() {
        return datumpozicania;
    }

    public void setDatumpozicania(String datumpozicania) {
        this.datumpozicania = datumpozicania;
    }

    @ApiModelProperty(example = "doggie", required = true, value = "")
    public String getDatumvratenia() {
        return datumvratenia;
    }

    public void setDatumvratenia(String datumvratenia) {
        this.datumvratenia = datumvratenia;
    }

    @ApiModelProperty(example = "doggie", required = true, value = "")
    public String getMaxdatum() {
        return maxdatum;
    }

    public void setMaxdatum(String maxdatum) {
        this.maxdatum = maxdatum;
    }

    @ApiModelProperty(example = "doggie", required = true, value = "")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    /*  public Pet id(Long id) {
        this.id = id;
        return this;
    }/*

    /**
     * Get id
     *
     * @return id
     *
     */
 /*   @ApiModelProperty(required = true, value="" )

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pet name(String name) {
        this.name = name;
        return this;
    }*/
    /**
     * Get name
     *
     * @return name
     *
     */
    /* @ApiModelProperty(example = "doggie", required = true, value = "")
    @NotNull

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }/*

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pet pet = (Pet) o;
        return Objects.equals(this.id, pet.id)
                && Objects.equals(this.name, pet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    /*  @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Pet {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
 /* private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }*/
    public Loan() {
    }

   public Loan(Long i, String name, String datumPozicania, String datumVratenia, String maxdatum, String note, Integer idUser,Integer idBook) {
        this.id = i;
        this.name = name;
        this.datumpozicania = datumPozicania;
        this.datumvratenia = datumVratenia;
        this.maxdatum = maxdatum;
        this.note = note;
        this.idUser=idUser;
        this.idBook=idBook;
    }
    
    
}
