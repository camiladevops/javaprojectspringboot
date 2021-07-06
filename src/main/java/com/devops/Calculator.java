package com.devops;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class Calculator {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("tstamp", LocalDateTime.now());
        return "index";
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("mensaje","hola desde thymeleaf");
        return "home";
    }

        public static int suma(int a, int b) {
            if (a < 0) {
                return a;
            }
            return a + b;
        }

        public static int resta(int a, int b) {
            return a - b;
        }


}

