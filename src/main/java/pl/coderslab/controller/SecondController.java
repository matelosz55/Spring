package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/second")
public class SecondController {
    @RequestMapping("/handle")
    @ResponseBody
    public String handler(){
        return "path_to_view";
    }
}
