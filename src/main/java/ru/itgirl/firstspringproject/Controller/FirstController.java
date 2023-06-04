package ru.itgirl.firstspringproject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {


    @GetMapping("/dayOfWeek")
    public String dayOfWeek(@RequestParam(value = "day") String dayOfWeek) {
        DayOfWeek.DayOfWeekEnum day = DayOfWeek.DayOfWeekEnum.valueOf(dayOfWeek);
        return String.format("Сегодня %s!", day.getRussianName());
    }
}
