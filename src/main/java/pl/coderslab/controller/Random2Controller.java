package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
@RequestMapping("/random2")
public class Random2Controller {
    @GetMapping("/{max}")
    @ResponseBody
    public String randomMax(@PathVariable int max){
        final int random = new Random(System.currentTimeMillis()).nextInt(max + 1) + 1;
        String responseText = String.format("Uzytkownik podal wartosc %s \nWylosowano liczbe: %s", max, random);
        return responseText;
    }

    @GetMapping("/{min}/{max}")
    @ResponseBody
    public String randomMinMax(@PathVariable int min , @PathVariable int max){
        final int random = new Random(System.currentTimeMillis()).nextInt(max - min ) + min + 1;
        String responseText = String.format("Uzytkownik podal wartosc %s i %s \nWylosowano liczbe: %s",min, max, random);
        return responseText;
    }

}
