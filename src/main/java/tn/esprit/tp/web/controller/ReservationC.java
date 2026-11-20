package tn.esprit.tp.web.controller;



import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp.domain.Reservation;
import tn.esprit.tp.service.ReservationS;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationC {

    private final ReservationS reservationS;


    @GetMapping("/retrieve-all-reservations")
    public List<Reservation> getReservations() {
        return reservationS.findAll();
    }


    @GetMapping("/retrieve-reservation/{reservation-id}")
    public ResponseEntity<Reservation> retrieveReservation(@PathVariable("reservation-id") Long reservationId) {
        return reservationS.findById(reservationId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationS.save(reservation);
    }


    @PutMapping("/modify-reservation/{reservation-id}")
    public Reservation modifyReservation(
                                         @RequestBody Reservation reservation) {
        return reservationS.update(reservation);
    }


    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void removeReservation(@PathVariable("reservation-id") Long reservationId) {
        reservationS.delete(reservationId);
    }
}