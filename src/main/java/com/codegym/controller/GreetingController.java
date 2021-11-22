package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam String name,Model model,String id){
        model.addAttribute("name",name);
        model.addAttribute("id",id);
        return "index";
    }
}
