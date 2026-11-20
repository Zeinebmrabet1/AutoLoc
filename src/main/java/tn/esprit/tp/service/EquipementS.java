package tn.esprit.tp.service;

import tn.esprit.tp.domain.Equipement;
import java.util.List;
import java.util.Optional;

public interface EquipementS {
    Equipement save(Equipement equipement);
    List<Equipement> findAll();
    Optional<Equipement> findById(Long id);
    Equipement update(Equipement equipement);
    void delete(Long id);
}