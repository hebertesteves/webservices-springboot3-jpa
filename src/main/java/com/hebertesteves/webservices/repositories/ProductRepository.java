package com.hebertesteves.webservices.repositories;

import com.hebertesteves.webservices.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
