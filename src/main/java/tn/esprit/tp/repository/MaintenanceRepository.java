package tn.esprit.tp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp.domain.Maintenance;

public interface MaintenanceRepository extends JpaRepository<Maintenance, Long> { }