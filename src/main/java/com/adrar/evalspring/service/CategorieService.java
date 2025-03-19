package com.adrar.evalspring.service;

import com.adrar.evalspring.exception.AddCategorieAlreadyExistsException;
import com.adrar.evalspring.exception.CategorieEmptyException;
import com.adrar.evalspring.exception.CategorieNotFoundException;
import com.adrar.evalspring.model.Categorie;
import com.adrar.evalspring.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategorieService {

    @Autowired
    private CategorieRepository categorieRepository;

    public Iterable<Categorie> getAllCategories() {
        if(categorieRepository.count() == 0) {
            throw new CategorieEmptyException();
        }
        return categorieRepository.findAll();
    }

    public Optional<Categorie> getCategorieById(int id) {
        if(!categorieRepository.existsById(id)){
            throw new CategorieNotFoundException(id);
        }

        return categorieRepository.findById(id);
    }

    public Categorie addCategorie(Categorie categorie) {
        if(categorieRepository.findByLibele(categorie.getLibele())) {
            throw new AddCategorieAlreadyExistsException();
        }
        return categorieRepository.save(categorie);
    }
}
