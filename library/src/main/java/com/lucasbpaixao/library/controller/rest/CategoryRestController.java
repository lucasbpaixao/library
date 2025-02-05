package com.lucasbpaixao.library.controller.rest;

import com.lucasbpaixao.library.model.Category;
import com.lucasbpaixao.library.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("category")
public class CategoryRestController {

    @Autowired
    private CategoryRepository categoryRepository;

    @PostMapping("create-category")
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
        categoryRepository.saveAndFlush(category);
        return new ResponseEntity<>(category, HttpStatus.CREATED);
    }

    @GetMapping("get-categories")
    public ResponseEntity<List<Category>> getAllCategories() {
        return new ResponseEntity<>(categoryRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("get-category/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable long id) {
        Optional<Category> categoryOptional = categoryRepository.findById(id);
        return categoryOptional.map(category -> new ResponseEntity<>(category, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("update-category")
    public ResponseEntity<Category> updateCategory(@RequestBody Category category) {
        categoryRepository.saveAndFlush(category);
        return new ResponseEntity<>(category, HttpStatus.OK);
    }

    @DeleteMapping("delete-category")
    public ResponseEntity<Category> deleteCategory(@RequestBody Category category) {
        categoryRepository.delete(category);
        return new ResponseEntity<>(category, HttpStatus.OK);
    }
}
