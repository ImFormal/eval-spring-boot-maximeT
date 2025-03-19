package com.adrar.evalspring.controller;

import com.adrar.evalspring.model.Categorie;
import com.adrar.evalspring.service.CategorieService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    @GetMapping("/categorie/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Categorie getCategorie(@PathVariable int id) {
        return categorieService.getCategorieById(id);
    }

    @GetMapping("/categories")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Categorie> getCategories() {
        return categorieService.getAllCategories();
    }

    @PostMapping("/categorie")
    @ResponseStatus(HttpStatus.CREATED)
    public Categorie createCategorie(@Valid @RequestBody Categorie categorie) {
        return categorieService.addCategorie(categorie);
    }
}
