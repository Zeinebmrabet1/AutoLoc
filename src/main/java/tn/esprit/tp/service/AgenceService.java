
package tn.esprit.tp.service;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import tn.esprit.tp.domain.Agence;
import tn.esprit.tp.repository.AgenceRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AgenceService implements AgenceS {

    private final AgenceRepository agenceRepository;

    public AgenceService(AgenceRepository agenceRepository) {
        this.agenceRepository = agenceRepository;
    }

    @Override
    public Agence save(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public List<Agence> findAll() {
        return agenceRepository.findAll();
    }

    @Override
    public Optional<Agence> findById(Long id) {
        return agenceRepository.findById(id);
    }

    @Override
    public Agence update(Agence agence) {

            return agenceRepository.save(agence);

    }

    @Override
    public void delete(Long id) {
        agenceRepository.deleteById(id);
    }
}