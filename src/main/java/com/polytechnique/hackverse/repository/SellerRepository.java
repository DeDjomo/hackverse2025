package com.polytechnique.hackverse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.polytechnique.hackverse.entities.Commercant;

public interface SellerRepository extends JpaRepository<Commercant, Integer> {
    Commercant findByShopEmail(String email);
}
