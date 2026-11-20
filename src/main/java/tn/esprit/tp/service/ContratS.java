package tn.esprit.tp.service;

import tn.esprit.tp.domain.Contrat;
import java.util.List;
import java.util.Optional;

public interface ContratS {
    Contrat save(Contrat contrat);
    List<Contrat> findAll();
    Optional<Contrat> findById(Long id);
    Contrat update(Contrat contrat);
    void delete(Long id);
}