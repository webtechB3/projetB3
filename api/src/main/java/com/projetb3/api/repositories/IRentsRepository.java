package com.projetb3.api.repositories;

import com.projetb3.api.entities.Rents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRentsRepository  extends JpaRepository<Rents, Integer> {
}


