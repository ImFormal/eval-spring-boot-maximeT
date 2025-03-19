package com.adrar.evalspring.service;

import com.adrar.evalspring.exception.AddProduitAlreadyExistsException;
import com.adrar.evalspring.exception.ProduitEmptyException;
import com.adrar.evalspring.exception.ProduitNotFoundException;
import com.adrar.evalspring.model.Produit;
import com.adrar.evalspring.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    public Iterable<Produit> getAllProduits() {
        if(produitRepository.count() == 0) {
            throw new ProduitEmptyException();
        }
        return produitRepository.findAll();
    }

    public Produit getProduitById(int id) {
        if(!produitRepository.existsById(id)){
            throw new ProduitNotFoundException(id);
        }
        return produitRepository.findById(id).get();
    }

    public Produit addProduit(Produit produit) {
        if(!produitRepository.findByNom(produit.getNom()).isEmpty()){
            throw new AddProduitAlreadyExistsException();
        }
        return produitRepository.save(produit);
    }
}