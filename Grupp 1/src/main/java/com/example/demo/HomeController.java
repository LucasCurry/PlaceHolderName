package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private DogRepository repository;


    @GetMapping("/")
    public String frontPage(){
        return "index";
    }

    @GetMapping("/dogs")
    public String Dogs(Model model){
        return "dogs";
    }






}
