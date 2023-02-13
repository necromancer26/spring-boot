package com.project.ski.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Inscription {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long numInscription;
    private int numSemaine;

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
