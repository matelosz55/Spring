package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MultiplyController {
    @GetMapping("/multiply/{size}")
    public String multiply(Model model, @PathVariable int size) {
        int rows = size;
        int cols = size;
        model.addAttribute("rows",rows);
        model.addAttribute("cols",cols);
        return "/multiply";
    }
}
