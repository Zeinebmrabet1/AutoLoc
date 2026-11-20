package tn.esprit.tp.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp.domain.Employe;
import tn.esprit.tp.service.EmployeS;
import tn.esprit.tp.web.dto.EmployeDTO;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/employe")
public class EmployeC {

    private final EmployeS employeS;


    @GetMapping("/retrieve-all-employes")
    public List<EmployeDTO> getEmployes() {
        return employeS.listE();
    }


    @GetMapping("/retrieve-employe/{employe-id}")
    public EmployeDTO retrieveEmploye(@PathVariable("employe-id") Long employeId) {
        return employeS.findE(employeId);
    }


    @PostMapping("/add-employe")
    public EmployeDTO addEmploye(@RequestBody Employe employe) {
        return employeS.save(employe);
    }


    @PutMapping("/modify-employe/{employe-id}")
    public EmployeDTO modifyEmploye( @RequestBody Employe employe)
    {
        return employeS.update(employe);
    }


    @DeleteMapping("/remove-employe/{employe-id}")
    public void removeEmploye(@PathVariable("employe-id") Long employeId) {
        employeS.delete(employeId);
    }

    @PutMapping("/{idEmploye}/desaffecter")
    public Employe desaffecterEmploye(@PathVariable Long idEmploye) {
        return employeS.desaffecterEmploye(idEmploye);
    }
    @PutMapping("/{idEmploye}/affecter/{idAgence}")
    public Employe affecterEmploye(
            @PathVariable Long idEmploye,
            @PathVariable Long idAgence) {
        return employeS.affecterEmploye(idEmploye, idAgence);
    }
}