package com.educandoweb.course.service;

import com.educandoweb.course.entity.Category;
import com.educandoweb.course.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    //retornar todas as categorias;
    public List<Category> findAllCategories(){
        return categoryRepository.findAll();
    }

    //retornar categoria por id;
    public Optional<Category> findById(Integer id){
        return categoryRepository.findById(id);
    }

}
