package com.project.ski.entities;
import jakarta.persistence.*;
import java.util.Date;
@Entity
public class Abonnement {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long numAbonnement;
    private Date dateDebut;
    private Date dateFin;
    private Float prixAbonnement;
    private TypeAbonnement typeAbonnement;

    public Abonnement( Date dateDebut, Date dateFin, Float prixAbonnement, TypeAbonnement typeAbonnement) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.prixAbonnement = prixAbonnement;
        this.typeAbonnement = typeAbonnement;
    }

    public Abonnement() {
    }

    public Long getNumAbonnement() {
        return numAbonnement;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public Float getPrixAbonnement() {
        return prixAbonnement;
    }

    public TypeAbonnement getTypeAbonnement() {
        return typeAbonnement;
    }

    public void setNumAbonnement(Long numAbonnement) {
        this.numAbonnement = numAbonnement;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public void setPrixAbonnement(Float prixAbonnement) {
        this.prixAbonnement = prixAbonnement;
    }

    public void setTypeAbonnement(TypeAbonnement typeAbonnement) {
        this.typeAbonnement = typeAbonnement;
    }
}
