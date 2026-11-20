package tn.esprit.tp.service;

import tn.esprit.tp.domain.Reservation;
import java.util.List;
import java.util.Optional;

public interface ReservationS {
    Reservation save(Reservation reservation);
    List<Reservation> findAll();
    Optional<Reservation> findById(Long id);
    Reservation update(Reservation reservation);
    void delete(Long id);
}