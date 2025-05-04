package com.polytechnique.hackverse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.polytechnique.hackverse.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
