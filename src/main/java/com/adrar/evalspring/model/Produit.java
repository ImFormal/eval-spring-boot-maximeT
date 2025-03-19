package com.adrar.evalspring.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nom", nullable = false)
    @NotBlank(message = "le nom doit être renseigné")
    @Size(min = 2, message = "Le nom doit posséder au moins 2 caractères")
    private String nom;

    @Column(name = "prix", nullable = false)
    @NotBlank(message = "le prix doit être renseigné")
    @Min(value = 0, message = "le prix doit être positif")
    @Size(min = 3, message = "Le nom doit posséder au moins 3 caractères")
    private double prix;

    public Produit() {
    }

    public Produit(int id, String nom, double prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }
}
