package com.yarisingu.loginpage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yarisingu.loginpage.dto.UserSignup;
import com.yarisingu.loginpage.helper.UserRepository;


@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("/registration")
    public String showRegistrationForm(Model model) {
        model.addAttribute("UserSignup", new UserSignup());
        return "registration";
    }

    @PostMapping("/register")
    public String register(UserSignup userSignup) {
       String s =  userSignup.getName();
       System.out.println(s);
        userRepository.save(userSignup);
        return "registration-success";
    }
}
