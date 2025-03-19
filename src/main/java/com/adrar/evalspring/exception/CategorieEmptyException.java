package com.adrar.evalspring.exception;

public class CategorieEmptyException extends RuntimeException {
    public CategorieEmptyException() {super("Aucune catégorie n'est enregistrée !");
    }
}
