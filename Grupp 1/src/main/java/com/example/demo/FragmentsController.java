package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FragmentsController {


    @GetMapping("/fragments")
    public String getFragments() {
        return "fragments.html";

    }



}