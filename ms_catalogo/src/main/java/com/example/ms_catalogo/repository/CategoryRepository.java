package com.example.ms_catalogo.repository;

import com.example.ms_catalogo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository  extends JpaRepository<Category, Integer> {

}