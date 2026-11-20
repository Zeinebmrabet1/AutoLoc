package tn.esprit.tp.service;

import org.springframework.stereotype.Service;
import tn.esprit.tp.domain.Equipement;
import tn.esprit.tp.repository.EquipementRepository;
import java.util.List;
import java.util.Optional;

@Service
public class EquipementService implements EquipementS {

    private final EquipementRepository equipementRepository;

    public EquipementService(EquipementRepository equipementRepository) {
        this.equipementRepository = equipementRepository;
    }

    @Override
    public Equipement save(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public List<Equipement> findAll() {
        return equipementRepository.findAll();
    }

    @Override
    public Optional<Equipement> findById(Long id) {
        return equipementRepository.findById(id);
    }

    @Override
    public Equipement update(Equipement equipement) {

        return equipementRepository.save(equipement);
    }

    @Override
    public void delete(Long id) {
        equipementRepository.deleteById(id);
    }
}