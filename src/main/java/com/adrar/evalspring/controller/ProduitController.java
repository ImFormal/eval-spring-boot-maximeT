package com.adrar.evalspring.controller;

import com.adrar.evalspring.model.Produit;
import com.adrar.evalspring.service.ProduitService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProduitController {

    @Autowired
    private ProduitService produitService;

    @GetMapping("/produit/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Produit getProduit(@PathVariable int id) {
        return produitService.getProduitById(id);
    }

    @GetMapping("/produits")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Produit> getProduits() {
        return produitService.getAllProduits();
    }

    @PostMapping("/produit")
    @ResponseStatus(HttpStatus.CREATED)
    public Produit createProduit(@Valid @RequestBody Produit produit) {
        return produitService.addProduit(produit);
    }
}