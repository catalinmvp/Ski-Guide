package com.wad.fils.course6.controllers;


import com.wad.fils.course6.domain.User;
import com.wad.fils.course6.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/register")
public class RegisterController {


    @Autowired private UserService userService;
    @GetMapping
    public String register1(){
        return "Register";
    }

    @PostMapping("/registersucces")
    public String submit(@ModelAttribute("user") User user) {

        System.out.println(user);
        PasswordEncoder bcrypt = new BCryptPasswordEncoder();
        user.setPassword(bcrypt.encode(user.getPassword()));
        userService.save(user);
        System.out.println("Register succeded!");
        return "home";
    }
}
