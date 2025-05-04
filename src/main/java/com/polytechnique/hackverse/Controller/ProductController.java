package com.polytechnique.hackverse.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.polytechnique.hackverse.entities.Produit;
import com.polytechnique.hackverse.service.ProductService;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
@RestController
@RequestMapping(path = "/product")
public class ProductController {
    private ProductService productService;

    //constructeur 
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // methode d'ajout d'un produit
    @PostMapping(path = "/addProduct", consumes = APPLICATION_JSON_VALUE)
    public void addProduct(@RequestBody Produit product) {
        productService.addProduct(product);
    }

    // methode de lecture de tous les produits
    @PostMapping(path = "/getAllProducts")
    public @ResponseBody Iterable<Produit> getAllProducts() {
        return productService.getAllProducts();
    }
}   


