package com.example.sbtests;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import lombok.Getter;
import lombok.Setter;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam Map<String, String> hello, 
    ModelMap model) {
        model.addAttribute("hello", hello);
        return "hello";
    }

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("user", new User());
        return "unified";
    }

    @PostMapping("/form")
    public String form(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        return "unified";
    }

    @Getter
    @Setter
    class User {
        private String email;
        private String senha;
    }
}
