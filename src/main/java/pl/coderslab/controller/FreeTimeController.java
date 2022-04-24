package pl.coderslab.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

@Controller
public class FreeTimeController {
    @GetMapping("/work")
    @ResponseBody
    public String getMessage() {
        LocalDate localDate = LocalDate.now();
        DayOfWeek dayOfWeek
                = DayOfWeek.from(localDate);
        Calendar calendar = GregorianCalendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        if (dayOfWeek.getValue() < 6 & dayOfWeek.getValue() > 0 &  hour > 8 & hour < 18){
            return "Nie dzwon, pracuje";
        } else if(dayOfWeek.getValue() < 6 & dayOfWeek.getValue() > 0 &  (hour < 9 || hour > 17)){
            return "Jestem po pracy";
        } else {
            return "Wolne";
        }
    }
}
