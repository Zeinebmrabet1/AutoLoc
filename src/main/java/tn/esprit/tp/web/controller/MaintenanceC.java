package tn.esprit.tp.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp.domain.Maintenance;
import tn.esprit.tp.service.MaintenanceS;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/maintenance")
public class MaintenanceC {

    private final MaintenanceS maintenanceS;

    @GetMapping("/retrieve-all-maintenances")
    public List<Maintenance> getMaintenances() {
        return maintenanceS.findAll();
    }


    @GetMapping("/retrieve-maintenance/{maintenance-id}")
    public ResponseEntity<Maintenance> retrieveMaintenance(@PathVariable("maintenance-id") Long maintenanceId) {
        return maintenanceS.findById(maintenanceId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


    @PostMapping("/add-maintenance")
    public Maintenance addMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceS.save(maintenance);
    }


    @PutMapping("/modify-maintenance/{maintenance-id}")
    public Maintenance modifyMaintenance(
                                         @RequestBody Maintenance maintenance) {
        return maintenanceS.update(maintenance);
    }


    @DeleteMapping("/remove-maintenance/{maintenance-id}")
    public void removeMaintenance(@PathVariable("maintenance-id") Long maintenanceId) {
        maintenanceS.delete(maintenanceId);
    }
}