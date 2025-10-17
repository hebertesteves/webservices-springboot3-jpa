package com.hebertesteves.webservices.repositories;

import com.hebertesteves.webservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
