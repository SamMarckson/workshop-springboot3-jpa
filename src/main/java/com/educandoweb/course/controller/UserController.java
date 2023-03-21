package com.educandoweb.course.controller;

import com.educandoweb.course.entity.User;
import com.educandoweb.course.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list = userService.findAllUsers();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping
    @RequestMapping("{id}")
    public Optional<User> userById(@PathVariable Integer id){
        return userService.findUserById(id);
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user){
        User obj = userService.insert(user);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);

    }


}
