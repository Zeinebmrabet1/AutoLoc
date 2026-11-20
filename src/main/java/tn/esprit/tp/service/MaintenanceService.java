package tn.esprit.tp.service;

import org.springframework.stereotype.Service;
import tn.esprit.tp.domain.Maintenance;
import tn.esprit.tp.repository.MaintenanceRepository;
import java.util.List;
import java.util.Optional;

@Service
public class MaintenanceService implements MaintenanceS {

    private final MaintenanceRepository maintenanceRepository;

    public MaintenanceService(MaintenanceRepository maintenanceRepository) {
        this.maintenanceRepository = maintenanceRepository;
    }

    @Override
    public Maintenance save(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public List<Maintenance> findAll() {
        return maintenanceRepository.findAll();
    }

    @Override
    public Optional<Maintenance> findById(Long id) {
        return maintenanceRepository.findById(id);
    }

    @Override
    public Maintenance update(Maintenance maintenance) {

        return maintenanceRepository.save(maintenance);
    }

    @Override
    public void delete(Long id) {
        maintenanceRepository.deleteById(id);
    }
}