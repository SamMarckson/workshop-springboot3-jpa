package com.educandoweb.course.controller;

import com.educandoweb.course.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(33, "Joans", "joans@yahoo.com", "6133840767", "iAmHappy");
        return ResponseEntity.ok().body(u);
    }


}
