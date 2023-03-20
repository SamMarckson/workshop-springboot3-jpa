package com.educandoweb.course.controller;

import com.educandoweb.course.entity.Category;
import com.educandoweb.course.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = categoryService.findAllCategories();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping
    @RequestMapping("{id}")
    public Optional<Category> userById(@PathVariable Integer id){
        return categoryService.findById(id);
    }


}
