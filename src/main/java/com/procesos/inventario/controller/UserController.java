package com.procesos.inventario.controller;

import com.procesos.inventario.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("users/{id}")
    public User getUserById(@PathVariable Long id){
        User user = new User(id, "Yorlin", "Arias", "Sesquicentenario", "yorlinandrey@gmail.com", "3229125548", "123456", "1004898208");
        return user;
    }
}
