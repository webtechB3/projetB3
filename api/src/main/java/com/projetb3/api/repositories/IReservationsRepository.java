package com.projetb3.api.repositories;

import com.projetb3.api.entities.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IReservationsRepository extends JpaRepository<Reservations, Integer> {
}
