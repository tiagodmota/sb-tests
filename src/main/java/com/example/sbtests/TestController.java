package com.example.sbtests;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    
    @GetMapping("/test")
    public String test(TestEntity test, Model model) {
        test.setId( Long.valueOf("1") );
        model.addAttribute("test", test);
        return "test";
    }
    
}
