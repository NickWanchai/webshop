package com.example.webshop.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homepage {

    @GetMapping ("/")
   public String index(){
       return "index";

   }


}
