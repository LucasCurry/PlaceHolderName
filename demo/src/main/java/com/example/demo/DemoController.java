package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    private DogRepository dogRepository = new DogRepository();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("dogs", dogRepository.getAllDogs());
        return "index";
    }
    @GetMapping("/dogs")
    public String Dogs(Model model){

        return "dogs";
    }
}