package com.example.ms_catalogo.service;

import com.example.ms_catalogo.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public List<Product> list();

    public Product save(Product product);

    public Product update(Product product);

    public Optional<Product> listById(Integer id);

    public void deleteById(Integer id);

}
