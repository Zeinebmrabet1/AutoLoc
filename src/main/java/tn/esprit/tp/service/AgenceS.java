package tn.esprit.tp.service;

import tn.esprit.tp.domain.Agence;
import java.util.List;
import java.util.Optional;

public interface AgenceS {


    Agence save(Agence agence);


    List<Agence> findAll();


    Optional<Agence> findById(Long id);


    Agence update(Agence agence);


    void delete(Long id);
}