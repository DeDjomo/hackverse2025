CREATE DATABASE hackverse;

USE hackverse;

CREATE TABLE COMMERCANT (
    id_commercant INT PRIMARY KEY AUTO_INCREMENT,
    nom_boutique VARCHAR(100) NOT NULL,
    mail VARCHAR(100) UNIQUE NOT NULL,
    telephone VARCHAR(20) NOT NULL,
    password VARCHAR(50)
);

CREATE TABLE PRODUIT (
    id_produit INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(100) NOT NULL,
    prix DECIMAL(10, 2) NOT NULL,
    qte_stock INT NOT NULL,
    description TEXT,
    photo LONGBLOB ,
    id_commercant INT NOT NULL,
    categorie VARCHAR(30),
    sous_categorie  VARCHAR(30),
    type VARCHAR(30),
    FOREIGN KEY (id_commercant) REFERENCES COMMERCANT(id_commercant),

);

CREATE TABLE CLIENT (
    id_client INT PRIMARY KEY AUTO_INCREMENT,
    nom  VARCHAR(100) NOT NULL, 
    matricule VARCHAR(20) NOT NULL,
    mail VARCHAR(100),
    numero VARCHAR(20),
    password VARCHAR(50)
);