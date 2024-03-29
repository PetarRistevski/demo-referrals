package com.petar.demoreferrals.controllers.rest;

import com.petar.demoreferrals.model.User;
import com.petar.demoreferrals.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/rest/user")
public class UserResources {
    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/save", "/"}, method = RequestMethod.POST, produces = "application/json")
    public User save(@RequestBody @Valid User user){
        userService.save(user);
        return user;
    }

}