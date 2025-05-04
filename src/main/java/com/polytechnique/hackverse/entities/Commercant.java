package com.polytechnique.hackverse.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "COMMERCANT")
public class Commercant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_commercant")
    private int id;

    @Column(name = "nom_boutique")
    private String shopName;

    @Column(name = "mail")
    private String shopEmail;

    @Column(name = "password")
    private String password;

    @Column(name = "telephone")
    private String phone;

    // constructeur vide
    public Commercant() {
    }

    // constructeur complet
    public Commercant(int id, String shopName, String shopEmail, String password, String phone) {
        this.id = id;
        this.shopName = shopName;
        this.shopEmail = shopEmail;
        this.password = password;
        this.phone = phone;
    }

    // getters et setters
    public int getId() {
        return id;
    }    

    public void setId(int id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopEmail() {
        return shopEmail;
    }

    public void setShopEmail(String shopEmail) {
        this.shopEmail = shopEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
