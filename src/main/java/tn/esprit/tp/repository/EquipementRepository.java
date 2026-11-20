package tn.esprit.tp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp.domain.Equipement;

public interface EquipementRepository extends JpaRepository<Equipement, Long> { }