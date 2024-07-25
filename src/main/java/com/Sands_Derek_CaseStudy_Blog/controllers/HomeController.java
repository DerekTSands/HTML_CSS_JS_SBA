package com.Sands_Derek_CaseStudy_Blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String index() {
        return "index"; // returns home.html template
    }

    @GetMapping("/news")
    public String news() {
        return "news"; // returns about.html template
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact"; // returns contact.html template
    }
}