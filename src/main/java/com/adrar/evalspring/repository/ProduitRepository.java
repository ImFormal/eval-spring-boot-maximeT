package com.adrar.evalspring.repository;

import com.adrar.evalspring.model.Produit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduitRepository extends CrudRepository<Produit, Integer> {
    List<Produit> findByNom(String nom);
}