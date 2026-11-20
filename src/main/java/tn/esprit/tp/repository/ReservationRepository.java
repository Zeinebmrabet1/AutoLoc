package tn.esprit.tp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp.domain.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> { }
