package com.projetb3.api.repositories;

import com.projetb3.api.entities.Publications;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPublicationsRepository extends JpaRepository<Publications, Integer> {
}
