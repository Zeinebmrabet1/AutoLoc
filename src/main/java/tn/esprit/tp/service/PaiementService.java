package tn.esprit.tp.service;

import org.springframework.stereotype.Service;
import tn.esprit.tp.domain.Paiement;
import tn.esprit.tp.repository.PaiementRepository;
import java.util.List;
import java.util.Optional;

@Service
public class PaiementService implements PaiementS {

    private final PaiementRepository paiementRepository;

    public PaiementService(PaiementRepository paiementRepository) {
        this.paiementRepository = paiementRepository;
    }

    @Override
    public Paiement save(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public List<Paiement> findAll() {
        return paiementRepository.findAll();
    }

    @Override
    public Optional<Paiement> findById(Long id) {
        return paiementRepository.findById(id);
    }

    @Override
    public Paiement update(Paiement paiement) {

        return paiementRepository.save(paiement);
    }

    @Override
    public void delete(Long id) {
        paiementRepository.deleteById(id);
    }
}