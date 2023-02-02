package com.example.sbtests;

import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import lombok.Getter;
import lombok.Setter;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "hello", required = false) Optional<String> hello, 
    ModelMap model) {
        model.addAttribute("hello", hello.orElse(null));
        return "hello";
    }

    @GetMapping("/form")
    public String form(Model model) {
        User user = new User();
        // user.setEmail("olhaio@gmail.com");
        // user.setSenha("98262681");
        model.addAttribute("user", user);
        return "unified";
    }

    @PostMapping("/form")
    public String form(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        return "unified";
    }

    @GetMapping("/pera")
    public String pera(User user) {
        return "pera";
    }

    @PostMapping("/pera")
    public String peraSubmit(@ModelAttribute User user) {
        return "pera";
    }

    @Getter
    @Setter
    class User {
        private String email;
        private String senha;
    }

    @ModelAttribute("enumTeste")
}
