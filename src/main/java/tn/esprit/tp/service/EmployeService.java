package tn.esprit.tp.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import tn.esprit.tp.domain.Agence;
import tn.esprit.tp.domain.Employe;
import tn.esprit.tp.repository.EmployeRepository;
import tn.esprit.tp.repository.AgenceRepository;
import tn.esprit.tp.web.dto.EmployeDTO;
import tn.esprit.tp.web.dto.EmployeMapper;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

@Service
public class EmployeService implements EmployeS {

    private final EmployeRepository employeRepository;
    private final AgenceRepository agenceRepository;
    private final EmployeMapper employeMapper;



    public EmployeService(EmployeRepository employeRepository,
                          AgenceRepository agenceRepository,
                          EmployeMapper employeMapper) {
        this.employeRepository = employeRepository;
        this.agenceRepository = agenceRepository;
        this.employeMapper = employeMapper;

    }

    @Override
    public EmployeDTO save(Employe employe) {
        return employeMapper.toDto(employeRepository.save(employe));
    }

    @Override
    public List<EmployeDTO> listE() {
        return employeRepository.findAll().stream().map(employeMapper::toDto).toList();
    }

    @Override
    public EmployeDTO findE(Long id) {
        Employe employe = employeRepository.findById(id).orElseThrow(null);


        return employeMapper.toDto(employe);
    }

    @Override
    public EmployeDTO update(Employe employe) {
        Employe e = employeRepository.save(employe);
        return employeMapper.toDto(e);
    }

    @Override
    public void delete(Long id) {
        employeRepository.deleteById(id);
    }
    @Override
    @Transactional
    public Employe desaffecterEmploye(Long idEmploye) {

        Employe employe = employeRepository.findById(idEmploye).get();

        employe.setAgence(null);

        return employeRepository.save(employe);
    }

    @Override
    @Transactional
    public Employe affecterEmploye(Long idEmploye, Long idAgence) {

        Employe employe = employeRepository.findById(idEmploye).get();

        Agence agence = agenceRepository.findById(idAgence).get();

        employe.setAgence(agence);

        return employeRepository.save(employe);
    }

}