package tn.esprit.tp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp.domain.Agence;

public interface AgenceRepository extends JpaRepository<Agence, Long> { }