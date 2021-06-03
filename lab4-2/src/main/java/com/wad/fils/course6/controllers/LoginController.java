package com.wad.fils.course6.controllers;


import com.wad.fils.course6.domain.User;
import com.wad.fils.course6.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/login")
public class LoginController {

    @Autowired private UserService userService;
    @GetMapping
    public String login(){
        return "login";
    }

    @PostMapping("/loginsucces")
    public String register(@ModelAttribute("user") User user){


        return "Shop";
    }


}
