package com.polytechnique.hackverse.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.polytechnique.hackverse.entities.Client;
import com.polytechnique.hackverse.service.ClientService;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
@RestController
@RequestMapping(path = "/client")
public class ClientController {
    private ClientService clientService;


    // constructeur 
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    // methode d'enregistrement d'un nouveau client
    @PostMapping(path = "/registerClient", consumes = APPLICATION_JSON_VALUE)
    public void registerClient(@RequestBody Client client) {
        clientService.registerClient(client);
    }

    // methode de lecture de tous les clients 
    @GetMapping(path = "/getAllClients")
    public @ResponseBody Iterable<Client> getAllClients() {
        return clientService.getAllClients();
    }
}
