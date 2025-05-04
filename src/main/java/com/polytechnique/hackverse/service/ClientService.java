package com.polytechnique.hackverse.service;

import org.springframework.stereotype.Service;

import com.polytechnique.hackverse.entities.Client;
import com.polytechnique.hackverse.repository.ClientRepository;

@Service
public class ClientService {
    private ClientRepository clientRepository;

    //constructeur de la classe
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    //methode d'enregistrement d'un nouveau client
    public void registerClient(Client client) {
        clientRepository.save(client);
    }

    // methode de lecture de tous les clients
    public Iterable<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
