package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
public class FormController {

    @GetMapping("/form")
    public String hello() {
        return "form.jsp";
    }
    @PostMapping("/form")
    @ResponseBody
    public String param1Show(@RequestParam String paramName, @RequestParam String paramDate){
        return paramName + paramDate;
    }

}