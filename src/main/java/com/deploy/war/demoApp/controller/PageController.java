package com.deploy.war.demoApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
   
    private List<String> newsList = new ArrayList<>();

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("newsList", newsList);
        return "home";
    }
    
    @PostMapping("/add-news")
    public String addNews(@RequestParam String news, Model model) {
        newsList.add(news);
        model.addAttribute("newsList", newsList);
        return "news";
    }
    
    
    @GetMapping("/about")
	public String AboutPage() {
		return "about";
	}
}
