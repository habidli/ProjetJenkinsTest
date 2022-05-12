package com.example.projetjenkinstest;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/bonjour")
    public String bonjour(){
        String bonjour = "Bonjour Tout Le monde ";
        return bonjour;
    }

}
