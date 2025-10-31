package com.example.ms_catalogo.controller;

import com.example.ms_catalogo.entity.Category;
import com.example.ms_catalogo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping()
    public ResponseEntity<List<Category>> list() {
        return ResponseEntity.ok().body(categoryService.list());
    }

    @PostMapping()
    public ResponseEntity<Category> save(@RequestBody Category category) {
        return ResponseEntity.ok(categoryService.save(category));
    }

    @PutMapping()
    public ResponseEntity<Category> update(@RequestBody Category category) {
        return ResponseEntity.ok(categoryService.update(category));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(categoryService.listById(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        categoryService.deleteById(id);
        return "";
    }

}
