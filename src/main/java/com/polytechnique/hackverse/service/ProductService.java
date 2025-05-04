package com.polytechnique.hackverse.service;

import org.springframework.stereotype.Service;

import com.polytechnique.hackverse.entities.Commercant;
import com.polytechnique.hackverse.entities.Produit;
import com.polytechnique.hackverse.repository.ProductRepository;

@Service
public class ProductService {
    private ProductRepository productRepository;
    private SellerService sellerService;

    //constructeur 
    public ProductService(ProductRepository productRepository, SellerService sellerService) {
        this.productRepository = productRepository;
        this.sellerService = sellerService;
    }

    // methode d'ajout d'un produit
    public void addProduct(Produit product) {
        Commercant seller = this.sellerService.creerOuLire(product.getCommercant());
        product.setCommercant(seller);
        productRepository.save(product);
    }

    // methode de lecture de tous les produits
    public Iterable<Produit> getAllProducts() {
        return productRepository.findAll();
    }
}
