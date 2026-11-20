package tn.esprit.tp.web.controller;



import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp.domain.Paiement;
import tn.esprit.tp.service.PaiementS;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/paiement")
public class PaiementC {

    private final PaiementS paiementS;


    @GetMapping("/retrieve-all-paiements")
    public List<Paiement> getPaiements() {
        return paiementS.findAll();
    }


    @GetMapping("/retrieve-paiement/{paiement-id}")
    public ResponseEntity<Paiement> retrievePaiement(@PathVariable("paiement-id") Long paiementId) {
        return paiementS.findById(paiementId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


    @PostMapping("/add-paiement")
    public Paiement addPaiement(@RequestBody Paiement paiement) {
        return paiementS.save(paiement);
    }


    @PutMapping("/modify-paiement/{paiement-id}")
    public Paiement modifyPaiement(
                                   @RequestBody Paiement paiement) {
        return paiementS.update(paiement);
    }


    @DeleteMapping("/remove-paiement/{paiement-id}")
    public void removePaiement(@PathVariable("paiement-id") Long paiementId) {
        paiementS.delete(paiementId);
    }
}