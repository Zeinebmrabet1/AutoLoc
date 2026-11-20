package tn.esprit.tp.web.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp.domain.Vehicule;
import tn.esprit.tp.service.VehiculeS;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/vehicule")
public class VehiculeC {

    private final VehiculeS vehiculeS;


    @GetMapping("/retrieve-all-vehicules")
    public List<Vehicule> getVehicules() {
        return vehiculeS.findAll();
    }


    @GetMapping("/retrieve-vehicule/{vehicule-id}")
    public ResponseEntity<Vehicule> retrieveVehicule(@PathVariable("vehicule-id") Long vehiculeId) {
        return vehiculeS.findById(vehiculeId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


    @PostMapping("/add-vehicule")
    public Vehicule addVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeS.save(vehicule);
    }


    @PutMapping("/modify-vehicule/{vehicule-id}")
    public Vehicule modifyVehicule(
                                   @RequestBody Vehicule vehicule) {
        return vehiculeS.update(vehicule);
    }


    @DeleteMapping("/remove-vehicule/{vehicule-id}")
    public void removeVehicule(@PathVariable("vehicule-id") Long vehiculeId) {
        vehiculeS.delete(vehiculeId);
    }

    @PutMapping("/{idVehicule}/affecterEquipement/{idEquipement}")
    public Vehicule affecterEquipement(
            @PathVariable Long idVehicule,
            @PathVariable Long idEquipement) {

        return vehiculeS.affecterEquipement(idVehicule, idEquipement);
    }
    @PutMapping("/{idVehicule}/desaffecterEquipement/{idEquipement}")
    public Vehicule desaffecterEquipement(
            @PathVariable Long idVehicule,
            @PathVariable Long idEquipement) {

        return vehiculeS.desaffecterEquipement(idVehicule, idEquipement);
    }

    @PutMapping("/{idVehicule}/affecter/{idAgence}")
    public Vehicule affecterVehicule(
            @PathVariable Long idVehicule,
            @PathVariable Long idAgence) {

        return vehiculeS.affecterVehicule(idVehicule, idAgence);
    }
}