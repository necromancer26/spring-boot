package com.project.ski.entities;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long numMoniteur;
    private String nomMoniteur;
    private String prenomMoniteur;
    private Date dateRecu;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Cour> cours;

    public Moniteur(String nomMoniteur, String prenomMoniteur, Date dateRecu) {
        this.nomMoniteur = nomMoniteur;
        this.prenomMoniteur = prenomMoniteur;
        this.dateRecu = dateRecu;
    }

    public Moniteur() {

    }

    public Long getNumMoniteur() {
        return numMoniteur;
    }

    public String getNomMoniteur() {
        return nomMoniteur;
    }

    public String getPrenomMoniteur() {
        return prenomMoniteur;
    }

    public Date getDateRecu() {
        return dateRecu;
    }

    public void setNumMoniteur(Long numMoniteur) {
        this.numMoniteur = numMoniteur;
    }

    public void setNomMoniteur(String nomMoniteur) {
        this.nomMoniteur = nomMoniteur;
    }

    public void setPrenomMoniteur(String prenomMoniteur) {
        this.prenomMoniteur = prenomMoniteur;
    }

    public void setDateRecu(Date dateRecu) {
        this.dateRecu = dateRecu;
    }
}
