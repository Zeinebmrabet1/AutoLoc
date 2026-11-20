package tn.esprit.tp.service;

import tn.esprit.tp.domain.Paiement;
import java.util.List;
import java.util.Optional;

public interface PaiementS {
    Paiement save(Paiement paiement);
    List<Paiement> findAll();
    Optional<Paiement> findById(Long id);
    Paiement update(Paiement paiement);
    void delete(Long id);
}