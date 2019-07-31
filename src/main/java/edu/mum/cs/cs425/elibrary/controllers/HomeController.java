package edu.mum.cs.cs425.elibrary.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(path = {"/",
            "/home", "/elibrary",
            "/elibrary/home"})
    public String home() {
        return "index";
    }


}
