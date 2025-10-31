package com.example.ms_catalogo.controller;

import com.example.ms_catalogo.entity.Product;
import com.example.ms_catalogo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping()
    public ResponseEntity<List<Product>> list() {
        return ResponseEntity.ok().body(productService.list());
    }

    @PostMapping()
    public ResponseEntity<Product> save(@RequestBody Product product) {
        return ResponseEntity.ok(productService.save(product));
    }

    @PutMapping()
    public ResponseEntity<Product> update(@RequestBody Product product) {
        return ResponseEntity.ok(productService.update(product));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> listById(@PathVariable(required = true) Integer id) {
        Optional<Product> client = productService.listById(id);
        return client.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        productService.deleteById(id);
        return "";
    }

}
