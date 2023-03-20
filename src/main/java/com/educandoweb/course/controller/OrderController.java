package com.educandoweb.course.controller;

import com.educandoweb.course.entity.Order;
import com.educandoweb.course.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    //retornar todas as ordens
    @GetMapping
    public ResponseEntity<List<Order>> findAllOrders(){
        return ResponseEntity.ok().body(orderService.findAllOrders());
    }

    @GetMapping
    @RequestMapping("{id}")
    public Optional<Order> orderById(@PathVariable Integer id){
        return orderService.findOrderById(id);
    }

}
