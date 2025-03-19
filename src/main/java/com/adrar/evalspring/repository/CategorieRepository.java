package com.adrar.evalspring.repository;

import com.adrar.evalspring.model.Categorie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategorieRepository extends CrudRepository<Categorie, Integer> {
    List<Categorie> findByLibele(String libele);
}