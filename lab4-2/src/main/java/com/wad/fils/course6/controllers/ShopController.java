package com.wad.fils.course6.controllers;


import com.wad.fils.course6.domain.User;
import com.wad.fils.course6.services.ProductSV;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/shop")
public class ShopController {
    //like display all product from prev labs

    private final ProductSV productSV;

    public ShopController(ProductSV productSV) {
        this.productSV = productSV;
    }

    @GetMapping
    public String seeProducts(Model model, Authentication authentication) {
        model.addAttribute("products", productSV.findAll());
        User user = (User) authentication.getPrincipal();
        log.info(user.getUsername());
        return "Shop";
    }

   @PostMapping("/new")
    public String buy(){
        System.out.println("Your purchase was registered");
        return "home";
   }



    
}
