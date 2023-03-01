package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping
public class HomeController {




    @GetMapping("/")
    public String frontPage(Model model){




        return "index";
    }

    @GetMapping("/dogs")
    public String Dogs(Model model){
        return "dogs";
    }






}
