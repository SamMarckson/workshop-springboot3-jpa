package com.educandoweb.course.service;

import com.educandoweb.course.entity.User;
import com.educandoweb.course.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //retornar todos os usuarios do bd;
    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    //retornar usuario por id;
    public Optional<User> findUserById(Integer id){
        return userRepository.findById(id);
    }

    //insert user
    public User insert(User user){
        return userRepository.save(user);
    }

}
