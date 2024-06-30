package com.example.telemedicineSystem.controllers;

import com.example.telemedicineSystem.dto.ScheduleDto;
import com.example.telemedicineSystem.services.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schedules")
@RequiredArgsConstructor
public class ScheduleController {
    private final ScheduleService scheduleService;

    @GetMapping
    public List<ScheduleDto> getAllProducts() {
        return scheduleService.findAll();
    }
}
