package pl.coderslab.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RandomController {
    @GetMapping("/show")
    @ResponseBody
    public String randomNumber(){
        int i = (int) ((Math.random() * 100));
        return  Integer.toString(i);
    }
}
