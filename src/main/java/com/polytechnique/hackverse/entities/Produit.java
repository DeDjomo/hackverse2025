package com.polytechnique.hackverse.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUIT")
public class Produit {
    @Id
    @Column(name = "id_produit")
    private int id;

    @Column(name = "nom")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "prix")
    private int prix;

    @JoinColumn(name = "categorie")
    private String categorie;

    @JoinColumn(name = "sous_categorie")
    private String subCategorie;


    @JoinColumn(name = "type")
    private String type;


    @JoinColumn(name = "id_commercant")
    @ManyToOne
    private Commercant commercant;

    @Column(name = "qte_stock")
    private int quantite;

    @Lob
    @Column(name = "photo", columnDefinition = "LONGBLOB")
    private byte[] photo;

    // constructeur vide pour JPA
    public Produit() {
    }

    // constructeur complet
    public Produit(int id, String name, String description, int prix, String categorie, Commercant commercant, int quantite, byte[] photo, String subCategorie, String type) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.prix = prix;
        this.categorie = categorie;
        this.commercant = commercant;
        this.quantite = quantite;
        this.photo = photo;
        this.subCategorie = subCategorie;
        this.type = type;
    }

    //getters et setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public Commercant getCommercant() {
        return commercant;
    }

    public void setCommercant(Commercant commercant) {
        this.commercant = commercant;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getsubCategorie() {
        return subCategorie;
    }

    public void setsubCategorie(String subCategorie) {
        this.subCategorie = subCategorie;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
