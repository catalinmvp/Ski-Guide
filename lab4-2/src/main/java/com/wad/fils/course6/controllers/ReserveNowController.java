package com.wad.fils.course6.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/reserve")
public class ReserveNowController {

    @GetMapping
    public String reserve(){
        return "ReserveNow";
    }

    @PostMapping("/submit")
    public String submit(){

        System.out.println("Reservation Completed");
        return "home";
    }
}
