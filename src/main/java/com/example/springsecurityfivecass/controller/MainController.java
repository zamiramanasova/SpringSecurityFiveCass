package com.example.springsecurityfivecass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
public class MainController {

    @GetMapping("/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Welcome to");
        messages.add("our big school");
        messages.add("find here your lesson!");
        model.addAttribute("messages", messages);
        return "views/company/welcome";
    }
}