package com.adrar.evalspring.controller;

import com.adrar.evalspring.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(ProduitNotFoundException.class)
    public ResponseEntity<Map<String, String>> produitNotFound(ProduitNotFoundException produitNotFound) {
        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("Erreur", produitNotFound.getMessage());
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(errorResponse);
    }

    @ExceptionHandler(CategorieNotFoundException.class)
    public ResponseEntity<Map<String, String>> categorieNotFound(CategorieNotFoundException categorieNotFound) {
        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("Erreur", categorieNotFound.getMessage());
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(errorResponse);
    }

    @ExceptionHandler(ProduitEmptyException.class)
    public ResponseEntity<Map<String, String>> produitEmpty(ProduitEmptyException produitEmpty) {
        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("Erreur", produitEmpty.getMessage());
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(errorResponse);
    }

    @ExceptionHandler(CategorieEmptyException.class)
    public ResponseEntity<Map<String, String>> categorieEmpty(CategorieEmptyException categorieEmpty) {
        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("Erreur", categorieEmpty.getMessage());
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(errorResponse);
    }

    @ExceptionHandler(AddProduitAlreadyExistsException.class)
    public ResponseEntity<Map<String, String>> saveProduitExists(AddProduitAlreadyExistsException addProduitAlreadyExists) {
        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("Erreur", addProduitAlreadyExists.getMessage());
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(errorResponse);
    }


    @ExceptionHandler(AddCategorieAlreadyExistsException.class)
    public ResponseEntity<Map<String, String>> saveCategorieExists(AddCategorieAlreadyExistsException addCategorieAlreadyExists) {
        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("Erreur", addCategorieAlreadyExists.getMessage());
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(errorResponse);
    }
}