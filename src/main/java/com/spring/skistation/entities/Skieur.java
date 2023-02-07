package com.spring.skistation.entities;
import java.util.Date;

import jakarta.persistence.*;

@Entity
public class Skieur {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long numSkieur;
@Column(name = "nom_s")
    private String nomS;

    public void setNumSkieur(Long numSkieur) {
        this.numSkieur = numSkieur;
    }

    public void setNomS(String nomS) {
        this.nomS = nomS;
    }

    public void setPrenomS(String prenomS) {
        this.prenomS = prenomS;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Long getNumSkieur() {
        return numSkieur;
    }

    public String getNomS() {
        return nomS;
    }

    public String getPrenomS() {
        return prenomS;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public String getVille() {
        return ville;
    }
    @Column(name = "prenom_s")

    private String prenomS;
    @Column(name = "date_naissance")

    private Date dateNaissance;
@Column(name = "ville")
    private String ville;
}
