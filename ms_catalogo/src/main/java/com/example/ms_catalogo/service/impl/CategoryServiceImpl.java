package com.example.ms_catalogo.service.impl;

import com.example.ms_catalogo.entity.Category;
import com.example.ms_catalogo.repository.CategoryRepository;
import com.example.ms_catalogo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> list() {
        return categoryRepository.findAll();
    }

    @Override
    public Category save(Category categoria) {
        return categoryRepository.save(categoria);
    }

    @Override
    public Category update(Category categoria) {
        return categoryRepository.save(categoria);
    }

    @Override
    public Optional<Category> listById(Integer id) {
        return categoryRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        categoryRepository.deleteById(id);
    }
}
