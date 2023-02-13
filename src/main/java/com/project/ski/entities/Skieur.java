package com.project.ski.entities;
import jakarta.persistence.*;
import java.util.Date;
@Entity
public class Skieur {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long numSkieur;
    @Column(name = "nom_skieur")
    private String nomSkieur;
    @Column(name = "prenom_skieur")
    private String prenomSkieur;
    @Column(name = "date_naissance")
    private Date dateNaissance;
    @Column(name = "ville")
    private String ville;

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