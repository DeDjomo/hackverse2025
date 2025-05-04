package com.polytechnique.hackverse.service;

import org.springframework.stereotype.Service;

import com.polytechnique.hackverse.entities.Commercant;
import com.polytechnique.hackverse.repository.SellerRepository;

@Service
public class SellerService {
    private SellerRepository sellerRepository;


    //constructeur
    public SellerService(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }

    // methode d'enregistrement d'un nouveau vendeur
    public void registerSeller(Commercant seller) {
        sellerRepository.save(seller);
    }

    // methode de lecture de tous les vendeurs
    public Iterable<Commercant> getAllSellers() {
        return sellerRepository.findAll();
    }

    // methode de lecture d'un vendeur
    public Commercant creerOuLire( Commercant commercant) {
        Commercant seller = sellerRepository.findByShopEmail(commercant.getShopEmail());
        if (seller == null) {
            this.sellerRepository.save(seller);
        }
        return seller;
    }
}
