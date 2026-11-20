package tn.esprit.tp.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp.domain.Agence;
import tn.esprit.tp.service.AgenceS;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/agence")
public class AgenceC {

    private final AgenceS agenceS;


    @GetMapping("/retrieve-all-agences")
    public List<Agence> getAgences() {
        return agenceS.findAll();
    }


    @GetMapping("/retrieve-agence/{agence-id}")
    public ResponseEntity<Agence> retrieveAgence(@PathVariable("agence-id") Long agenceId) {
        return agenceS.findById(agenceId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


    @PostMapping("/add-agence")
    public Agence addAgence(@RequestBody Agence agence) {
        return agenceS.save(agence);
    }


    @PutMapping("/modify-agence/{agence-id}")
    public Agence modifyAgence(
                               @RequestBody Agence agence) {
        return agenceS.update(agence);
    }


    @DeleteMapping("/remove-agence/{agence-id}")
    public void removeAgence(@PathVariable("agence-id") Long agenceId) {
        agenceS.delete(agenceId);
    }
}