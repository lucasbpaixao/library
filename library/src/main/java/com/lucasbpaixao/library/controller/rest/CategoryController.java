package com.lucasbpaixao.library.controller.rest;

import com.lucasbpaixao.library.model.Category;
import com.lucasbpaixao.library.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @PostMapping("create-category")
    public ResponseEntity<Category> creteCategory(@RequestBody Category category) {
        categoryRepository.saveAndFlush(category);
        return new ResponseEntity<>(category, HttpStatus.CREATED);
    }

    @GetMapping("get-categories")
    public ResponseEntity<List<Category>> getAllCategories() {
        categoryRepository.findAll();
        return new ResponseEntity<>(categoryRepository.findAll(), HttpStatus.OK);
    }
}
