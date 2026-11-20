package tn.esprit.tp.service;

import tn.esprit.tp.domain.Maintenance;
import java.util.List;
import java.util.Optional;

public interface MaintenanceS {
    Maintenance save(Maintenance maintenance);
    List<Maintenance> findAll();
    Optional<Maintenance> findById(Long id);
    Maintenance update(Maintenance maintenance);
    void delete(Long id);
}