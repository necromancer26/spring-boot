package com.project.ski.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Piste {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long numPiste;
    private String nomPiste;
    private Couleur couleur;
    private int longuer;
    private int pente;

    public Piste(String nomPiste, Couleur couleur, int longuer, int pente) {
        this.nomPiste = nomPiste;
        this.couleur = couleur;
        this.longuer = longuer;
        this.pente = pente;
    }

    public Piste() {
    }

    public Long getNumPiste() {
        return numPiste;
    }

    public String getNomPiste() {
        return nomPiste;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public int getLonguer() {
        return longuer;
    }

    public int getPente() {
        return pente;
    }

    public void setNumPiste(Long numPiste) {
        this.numPiste = numPiste;
    }

    public void setNomPiste(String nomPiste) {
        this.nomPiste = nomPiste;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public void setLonguer(int longuer) {
        this.longuer = longuer;
    }

    public void setPente(int pente) {
        this.pente = pente;
    }
}
