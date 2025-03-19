package com.adrar.evalspring.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "produit")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nom", unique = true, nullable = false)
    @NotBlank(message = "le nom doit être renseigné")
    @Size(min = 2, message = "Le nom doit posséder au moins 2 caractères")
    private String nom;

    @Column(name = "prix", nullable = false)
    @NotNull(message = "le prix doit être renseigné")
    @Min(value = 0, message = "le prix doit être positif")
    private double prix;

    @ManyToOne
    @JoinColumn(name = "id_categorie")
    private Categorie categorie;

    public Produit() {
    }

    public Produit(int id, String nom, double prix){
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }

    public Produit(int id, String nom, double prix, Categorie categorie) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                ", catégorie=" + categorie +
                '}';
    }
}
