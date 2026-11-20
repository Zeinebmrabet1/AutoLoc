package tn.esprit.tp.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp.domain.Equipement;
import tn.esprit.tp.service.EquipementS;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipement")
public class EquipementC {

    private final EquipementS equipementS;


    @GetMapping("/retrieve-all-equipements")
    public List<Equipement> getEquipements() {
        return equipementS.findAll();
    }


    @GetMapping("/retrieve-equipement/{equipement-id}")
    public ResponseEntity<Equipement> retrieveEquipement(@PathVariable("equipement-id") Long equipementId) {
        return equipementS.findById(equipementId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


    @PostMapping("/add-equipement")
    public Equipement addEquipement(@RequestBody Equipement equipement) {
        return equipementS.save(equipement);
    }


    @PutMapping("/modify-equipement/{equipement-id}")
    public Equipement modifyEquipement(
                                       @RequestBody Equipement equipement) {
        return equipementS.update(equipement);
    }


    @DeleteMapping("/remove-equipement/{equipement-id}")
    public void removeEquipement(@PathVariable("equipement-id") Long equipementId) {
        equipementS.delete(equipementId);
    }
}