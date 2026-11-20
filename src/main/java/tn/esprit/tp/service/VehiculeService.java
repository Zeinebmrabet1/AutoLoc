package tn.esprit.tp.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import tn.esprit.tp.domain.Agence;
import tn.esprit.tp.domain.Vehicule;
import tn.esprit.tp.repository.VehiculeRepository;
import tn.esprit.tp.repository.AgenceRepository;
import tn.esprit.tp.domain.Equipement;
import tn.esprit.tp.repository.EquipementRepository;
import java.util.List;
import java.util.Optional;

@Service
public class VehiculeService implements VehiculeS {

    private final VehiculeRepository vehiculeRepository;
    private final AgenceRepository agenceRepository;
    private final EquipementRepository equipementRepository;

    public VehiculeService(VehiculeRepository vehiculeRepository,
                           AgenceRepository agenceRepository,
                           EquipementRepository equipementRepository) {
        this.vehiculeRepository = vehiculeRepository;
        this.agenceRepository = agenceRepository;
        this.equipementRepository = equipementRepository;
    }

    @Override
    public Vehicule save(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public List<Vehicule> findAll() {
        return vehiculeRepository.findAll();
    }

    @Override
    public Optional<Vehicule> findById(Long id) {
        return vehiculeRepository.findById(id);
    }

    @Override
    public Vehicule update(Vehicule vehicule) {

        return vehiculeRepository.save(vehicule);
    }

    @Override
    public void delete(Long id) {
        vehiculeRepository.deleteById(id);
    }
    @Override
    @Transactional
    public Vehicule affecterVehicule(Long idVehicule, Long idAgence) {

        Vehicule vehicule = vehiculeRepository.findById(idVehicule).get();

        Agence agence = agenceRepository.findById(idAgence).get();

        vehicule.setAgence(agence);

        return vehiculeRepository.save(vehicule);
    }

    @Override
    @Transactional
    public Vehicule affecterEquipement(Long idVehicule, Long idEquipement) {

        Vehicule vehicule = vehiculeRepository.findById(idVehicule).get();

        Equipement equipement = equipementRepository.findById(idEquipement).get();

        vehicule.getEquipements().add(equipement);

        return vehiculeRepository.save(vehicule);
    }
    @Override
    @Transactional
    public Vehicule desaffecterEquipement(Long idVehicule, Long idEquipement) {

        Vehicule vehicule = vehiculeRepository.findById(idVehicule).get();

        Equipement equipement = equipementRepository.findById(idEquipement).get();

        vehicule.getEquipements().remove(equipement);

        return vehiculeRepository.save(vehicule);
    }
}