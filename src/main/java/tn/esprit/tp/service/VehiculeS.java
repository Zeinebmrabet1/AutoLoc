package tn.esprit.tp.service;

import tn.esprit.tp.domain.Vehicule;
import java.util.List;
import java.util.Optional;

public interface VehiculeS {
    Vehicule save(Vehicule vehicule);
    List<Vehicule> findAll();
    Optional<Vehicule> findById(Long id);
    Vehicule update(Vehicule vehicule);
    void delete(Long id);
    Vehicule affecterVehicule(Long idVehicule, Long idAgence);
    Vehicule affecterEquipement(Long idVehicule, Long idEquipement);
    Vehicule desaffecterEquipement(Long idVehicule, Long idEquipement);
}