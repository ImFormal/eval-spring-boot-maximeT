package com.adrar.evalspring.exception;

public class AddCategorieAlreadyExistsException extends RuntimeException {
    public AddCategorieAlreadyExistsException() {
        super("Cette catégorie existe déjà !");
    }
}
