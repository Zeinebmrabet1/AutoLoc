package tn.esprit.tp.service;

import org.springframework.stereotype.Service;
import tn.esprit.tp.domain.Contrat;
import tn.esprit.tp.repository.ContratRepository;
import java.util.List;
import java.util.Optional;

@Service
public class ContratService implements ContratS {

    private final ContratRepository contratRepository;

    public ContratService(ContratRepository contratRepository) {
        this.contratRepository = contratRepository;
    }

    @Override
    public Contrat save(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public List<Contrat> findAll() {
        return contratRepository.findAll();
    }

    @Override
    public Optional<Contrat> findById(Long id) {
        return contratRepository.findById(id);
    }

    @Override
    public Contrat update(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public void delete(Long id) {
        contratRepository.deleteById(id);
    }
}