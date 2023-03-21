package com.educandoweb.course.service;

import com.educandoweb.course.entity.User;
import com.educandoweb.course.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

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

    //delete user
    public void delByID(Integer id){
        userRepository.deleteById(id);
    }

    //update user
    public User update(Integer id, User obj){
        User entity = userRepository.getReferenceById(id);
        updateData(entity, obj);
        return userRepository.save(entity);
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }

}
