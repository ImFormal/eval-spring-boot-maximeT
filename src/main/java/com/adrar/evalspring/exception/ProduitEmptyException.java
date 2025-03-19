package com.adrar.evalspring.exception;

public class ProduitEmptyException extends RuntimeException {
    public ProduitEmptyException() {super("Aucun produit n'est enregistré !");
    }
}
