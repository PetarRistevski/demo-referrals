package com.petar.demoreferrals.controllers;

//import com.petar.demoreferrals.model.User;
//import com.petar.demoreferrals.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
//    @Autowired
//    private UserService userService;

    @GetMapping("/login")
    public String showLogin(){
        return "login";
    }
    @GetMapping("/")
    public String showHome(){
        return "home";
    }

//    @GetMapping("/register")
//    public String showRegister(Model model){
//        model.addAttribute("users", userService.findAll());
//        model.addAttribute("user", new User());
//        return "register";
//    }
//    @PostMapping("/save")
//    public String saveUser(@ModelAttribute User user, Model model) {
//        model.addAttribute("users", userService.findAll());
//        userService.save(user);
//        return "success";
//    }
}
