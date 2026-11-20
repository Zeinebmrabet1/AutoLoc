package tn.esprit.tp.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp.domain.Client;
import tn.esprit.tp.service.ClientS;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientC {

    private final ClientS clientS;


    @GetMapping("/retrieve-all-clients")
    public List<Client> getClients() {
        return clientS.findAll();
    }


    @GetMapping("/retrieve-client/{client-id}")
    public ResponseEntity<Client> retrieveClient(@PathVariable("client-id") Long clientId) {
        return clientS.findById(clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


    @PostMapping("/add-client")
    public Client addClient(@RequestBody Client client) {
        return clientS.save(client);
    }


    @PutMapping("/modify-client/{client-id}")
    public Client modifyClient(
                               @RequestBody Client client) {
        return clientS.update(client);
    }


    @DeleteMapping("/remove-client/{client-id}")
    public void removeClient(@PathVariable("client-id") Long clientId) {
        clientS.delete(clientId);
    }
}