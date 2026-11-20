package tn.esprit.tp.service;

import tn.esprit.tp.domain.Client;
import java.util.List;
import java.util.Optional;

public interface ClientS {
    Client save(Client client);
    List<Client> findAll();
    Optional<Client> findById(Long id);
    Client update(Client client);
    void delete(Long id);
}