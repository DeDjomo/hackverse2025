package com.polytechnique.hackverse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.polytechnique.hackverse.entities.Produit;

public interface ProductRepository extends JpaRepository<Produit, Integer> {
    
}
