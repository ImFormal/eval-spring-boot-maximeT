package com.adrar.evalspring.exception;

public class AddProduitAlreadyExistsException extends RuntimeException {
    public AddProduitAlreadyExistsException() {
        super("Ce produit existe déjà !");
    }
}
