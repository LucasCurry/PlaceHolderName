package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DemoController {

    @Autowired
    private DogRepository dogRepository;
    private static final int PAGE_SIZE = 8;

    @GetMapping("/")
    public String index(Model model) {

        return "index";
    }
    @GetMapping("/dogs")
    public String Dogs(Model model, @RequestParam(value="page", required=false, defaultValue="1") int page){
        List<Dog> dogs = dogRepository.getPage(page-1, PAGE_SIZE);
        int pageCount = dogRepository.numberOfPages(PAGE_SIZE);
        int[] pages = toArray(pageCount);

        model.addAttribute("dogs", dogs);
        model.addAttribute("pages", pages);
        model.addAttribute("currentPage", page);
        model.addAttribute("showPrev", page > 1);
        model.addAttribute("showNext", page < pageCount);

        return "dogs";
    }
    @GetMapping("/dog/{id}")
    public String book(Model model, @PathVariable Integer id) {
        Dog dog = dogRepository.getDog(id);
        model.addAttribute("dog", dog);

        return "dog";
    }
    private int[] toArray(int num) {
        int[] result = new int[num];
        for (int i = 0; i < num; i++) {
            result[i] = i+1;
        }
        return result;
    }
}