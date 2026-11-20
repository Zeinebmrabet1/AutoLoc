package tn.esprit.tp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp.domain.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> { }
