package com.project.ski.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cour {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long numCour;
    private int niveau;
    private TypeCour typeCour;
    private Support support;
    private Float prix;
    private int creneau;

    public Cour(int niveau, TypeCour typeCour, Support support, Float prix, int creneau) {
        this.niveau = niveau;
        this.typeCour = typeCour;
        this.support = support;
        this.prix = prix;
        this.creneau = creneau;
    }

    public Cour() {
    }

    public Long getNumCour() {
        return numCour;
    }

    public int getNiveau() {
        return niveau;
    }

    public TypeCour getTypeCour() {
        return typeCour;
    }

    public Support getSupport() {
        return support;
    }

    public Float getPrix() {
        return prix;
    }

    public int getCreneau() {
        return creneau;
    }

    public void setNumCour(Long numCour) {
        this.numCour = numCour;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public void setTypeCour(TypeCour typeCour) {
        this.typeCour = typeCour;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public void setCreneau(int creneau) {
        this.creneau = creneau;
    }
}
