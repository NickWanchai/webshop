package com.example.webshop.controller;

import com.example.webshop.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodController {


    @GetMapping ("/food")
    public String food(){

        return "food";

    }



}
