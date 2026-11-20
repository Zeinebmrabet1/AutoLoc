package tn.esprit.tp.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp.domain.Contrat;
import tn.esprit.tp.service.ContratS;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/contrat")
public class ContratC {

    private final ContratS contratS;


    @GetMapping("/retrieve-all-contrats")
    public List<Contrat> getContrats() {
        return contratS.findAll();
    }


    @GetMapping("/retrieve-contrat/{contrat-id}")
    public ResponseEntity<Contrat> retrieveContrat(@PathVariable("contrat-id") Long contratId) {
        return contratS.findById(contratId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/add-contrat")
    public Contrat addContrat(@RequestBody Contrat contrat) {
        return contratS.save(contrat);
    }


    @PutMapping("/modify-contrat/{contrat-id}")
    public Contrat modifyContrat(
                                 @RequestBody Contrat contrat) {
        return contratS.update(contrat);
    }


    @DeleteMapping("/remove-contrat/{contrat-id}")
    public void removeContrat(@PathVariable("contrat-id") Long contratId) {
        contratS.delete(contratId);
    }
}