package com.example.SistemaWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/")
    public String index() {
        return "index";  // Servir el archivo index.html o la vista principal
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog";  // Servir blog.html
    }

    @GetMapping("/estudiar-aqui")
    public String estudiarAqui() {
        return "estudiar-aqui";  // Servir estudiar-aqui.html
    }

    @GetMapping("/login")
    public String login() {
        return "login";  // Servir login.html
    }

}
