package com.polytechnique.hackverse.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.polytechnique.hackverse.entities.Commercant;
import com.polytechnique.hackverse.service.SellerService;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
@RestController
@RequestMapping(path = "/seller")
public class SellerController {
    private SellerService sellerService;

    //constructeur
    public SellerController(SellerService sellerService) {
        this.sellerService = sellerService;
    }

    // methode d'enregistrement d'un nouveau vendeur
    @PostMapping(path = "/registerSeller", consumes = APPLICATION_JSON_VALUE)
    public void registerSeller(@RequestBody Commercant seller) {
        sellerService.registerSeller(seller);
    }

    // lire tous les vendeurs
    @GetMapping(path = "/getAllSellers")
    public @ResponseBody Iterable<Commercant> getAllSellers() {
        return sellerService.getAllSellers();
    }
}
