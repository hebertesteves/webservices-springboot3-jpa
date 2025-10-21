package com.hebertesteves.webservices.repositories;

import com.hebertesteves.webservices.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemItemRepository extends JpaRepository<OrderItem, Long> {

}
