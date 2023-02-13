package com.project.ski.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long numInscription;
    private int numSemaine;
    @ManyToOne
    private Skieur skieur;
    @OneToOne
    private Abonnement abonnement;
    @ManyToOne
    private Cour cour;

    public Inscription(int numSemaine) {
        this.numSemaine = numSemaine;
    }

    public Inscription() {
    }

    public Long getNumInscription() {
        return numInscription;
    }

    public int getNumSemaine() {
        return numSemaine;
    }

    public void setNumInscription(Long numInscription) {
        this.numInscription = numInscription;
    }

    public void setNumSemaine(int numSemaine) {
        this.numSemaine = numSemaine;
    }
}
