package tn.esprit.tp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp.domain.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long> { }