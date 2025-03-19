package com.adrar.evalspring.exception;

public class CategorieNotFoundException extends RuntimeException {
    public CategorieNotFoundException(Integer id) {
        super("La catégorie avec id : " + id + " n'existe pas !");
    }
}