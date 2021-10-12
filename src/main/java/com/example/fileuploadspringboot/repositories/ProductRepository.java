package com.example.fileuploadspringboot.repositories;

import com.example.fileuploadspringboot.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByName(String productName);
}
