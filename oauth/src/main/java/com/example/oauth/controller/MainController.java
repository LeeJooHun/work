package com.example.oauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/main")
    public String mainPage(){
        return "main";
    }

    @GetMapping("/")
    public String redirect(){
        return "redirect:/main";
    }
}
