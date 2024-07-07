package com.example.demo.controllers;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.service.PartService;
import com.example.demo.service.ProductService;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;



@Controller
public class AboutController {

    public AboutController(){
    }

        @GetMapping("/about")
        public String aboutPage(Model theModel, @Param("partkeyword") String partkeyword, @Param("productkeyword") String productkeyword){
            return "about";
        }
    }


