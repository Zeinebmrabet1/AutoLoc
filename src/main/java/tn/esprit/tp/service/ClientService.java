package tn.esprit.tp.service;

import org.springframework.stereotype.Service;
import tn.esprit.tp.domain.Client;
import tn.esprit.tp.repository.ClientRepository;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService implements ClientS {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client save(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> findById(Long id) {
        return clientRepository.findById(id);
    }

    @Override
    public Client update(Client client) {

        return clientRepository.save(client);
    }

    @Override
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }
}