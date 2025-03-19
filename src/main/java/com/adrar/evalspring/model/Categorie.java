package com.adrar.evalspring.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "categorie")
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "libele", unique = true, nullable = false)
    @NotBlank(message = "le libele doit être renseigné")
    @Size(min = 2, message = "Le libele doit posséder au moins 2 caractères")
    private String libele;

    public Categorie() {
    }

    public Categorie(Integer id, String libele) {
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
