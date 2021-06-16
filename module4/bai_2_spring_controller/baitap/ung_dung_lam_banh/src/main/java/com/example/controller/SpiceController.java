package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class SpiceController {

    @GetMapping(value = {"/","/spice"})
    public String spice(){
        return "index";
    }


    @PostMapping(value = "/display")
    public String display(@RequestParam String check, Model model){
    model.addAttribute("check",check);
    return "index";
    }

}
