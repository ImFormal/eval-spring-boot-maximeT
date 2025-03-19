package com.adrar.evalspring.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "libele", nullable = false)
    @NotBlank(message = "le libele doit être renseigné")
    @Size(min = 2, message = "Le libele doit posséder au moins 2 caractères")
    private String libele;

    public Categorie() {
    }

    public Categorie(int id, String libele) {
        this.id = id;
        this.libele = libele;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "id=" + id +
                ", libele='" + libele + '\'' +
                '}';
    }
}
