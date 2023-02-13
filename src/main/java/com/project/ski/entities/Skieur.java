package com.project.ski.entities;
import jakarta.persistence.*;
import org.hibernate.engine.internal.Cascade;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long numSkieur;
    private String nomSkieur;
    private String prenomSkieur;
    private Date dateNaissance;
    private String ville;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "skieur")
    private List<Inscription> inscriptions;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Piste> pistes;

    public Skieur( String nomSkieur, String prenomSkieur, Date dateNaissance, String ville) {
        this.nomSkieur = nomSkieur;
        this.prenomSkieur = prenomSkieur;
        this.dateNaissance = dateNaissance;
        this.ville = ville;
    }

    public Skieur() {

    }

    public Long getNumSkieur() {
        return numSkieur;
    }

    public String getNomSkieur() {
        return nomSkieur;
    }

    public String getPrenomSkieur() {
        return prenomSkieur;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public String getVille() {
        return ville;
    }

    public void setNumSkieur(Long numSkieur) {
        this.numSkieur = numSkieur;
    }

    public void setNomSkieur(String nomSkieur) {
        this.nomSkieur = nomSkieur;
    }

    public void setPrenomS(String prenomSkieur) {
        this.prenomSkieur = prenomSkieur;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}