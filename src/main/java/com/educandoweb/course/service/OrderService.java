package com.educandoweb.course.service;

import com.educandoweb.course.entity.Order;
import com.educandoweb.course.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    //retornar todas as ordens;
    public List<Order> findAllOrders(){
        return orderRepository.findAll();
    }

    //retornar ordem por id;
    public Optional<Order> findOrderById(Integer id){
        return orderRepository.findById(id);
    }


}
