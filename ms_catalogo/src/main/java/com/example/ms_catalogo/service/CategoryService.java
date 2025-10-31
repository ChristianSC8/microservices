package com.example.ms_catalogo.service;

import com.example.ms_catalogo.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    public List<Category> list();

    public Category save(Category category);

    public Category update(Category category);

    public Optional<Category> listById(Integer id);

    public void deleteById(Integer id);

}
