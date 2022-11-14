package com.codewithisa.aplikasitiketbioskop.controller;

import com.codewithisa.aplikasitiketbioskop.entity.Schedules;
import com.codewithisa.aplikasitiketbioskop.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/schedules")
public class ScheduleController {
    @Autowired
    ScheduleService scheduleService;
    @PostMapping("{filmName}")
    public List<Schedules> getSchedulesByFilmName(@PathVariable("filmName") String filmName){
        return scheduleService.getSchedulesByFilmName(filmName);
    }
}
