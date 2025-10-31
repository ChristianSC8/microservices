package com.example.ms_catalogo.repository;

import com.example.ms_catalogo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}