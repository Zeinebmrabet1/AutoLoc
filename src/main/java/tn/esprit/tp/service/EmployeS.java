package tn.esprit.tp.service;

import tn.esprit.tp.domain.Employe;
import tn.esprit.tp.web.dto.EmployeDTO;

import java.util.List;

public interface EmployeS {
    EmployeDTO save(Employe employe);
    List<EmployeDTO> listE();
    public EmployeDTO findE(Long id);
   public  EmployeDTO update(Employe employe);
    void delete(Long id);
    Employe desaffecterEmploye(Long idEmploye);

    Employe affecterEmploye(Long idEmploye, Long idAgence);

}