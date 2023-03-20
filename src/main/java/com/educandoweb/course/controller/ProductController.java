package com.educandoweb.course.controller;

import com.educandoweb.course.entity.Product;
import com.educandoweb.course.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
//    public ResponseEntity<List<Product>> productsList(){
//        return ResponseEntity.ok().body(productService.findAllProducts());
//    }
//
    public List<Product> productsList(){
        return productService.findAllProducts();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Optional<Product> productById(@PathVariable Integer id){
        return productService.findProductById(id);
    }

}
