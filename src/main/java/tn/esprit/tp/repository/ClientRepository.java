package tn.esprit.tp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.tp.domain.Client;

public interface ClientRepository extends JpaRepository<Client, Long> { }

