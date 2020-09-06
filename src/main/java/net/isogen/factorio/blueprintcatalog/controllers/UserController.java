package net.isogen.factorio.blueprintcatalog.controllers;

import net.isogen.factorio.blueprintcatalog.models.User;
import net.isogen.factorio.blueprintcatalog.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepo users;

    @GetMapping("/api/users")
    public List<User> getUSers(){
        return users.findAll();
    }
}
