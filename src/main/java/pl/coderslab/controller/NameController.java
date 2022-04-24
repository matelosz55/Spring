package pl.coderslab.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
@RequestMapping("/name")
public class NameController {
    @GetMapping("/hello/{firstName}/{lastName}")
    @ResponseBody
    public String randomMax(@PathVariable String firstName, @PathVariable String lastName){

        return "Witaj " + firstName + " " + lastName;
    }

}
