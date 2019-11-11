package com.projetb3.api.repositories;

import com.projetb3.api.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsersRepository extends JpaRepository<Users, Integer> {
}
