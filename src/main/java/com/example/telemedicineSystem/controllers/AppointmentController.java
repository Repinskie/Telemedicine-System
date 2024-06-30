package com.example.telemedicineSystem.controllers;

import com.example.telemedicineSystem.dto.AppointmentDto;
import com.example.telemedicineSystem.services.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appointments")
@RequiredArgsConstructor
public class AppointmentController {
    private final AppointmentService appointmentService;

    @GetMapping
    public List<AppointmentDto> getAllProducts() {
        return appointmentService.findAll();
    }

    @PostMapping("/create")
    public AppointmentDto createAppointment(@RequestBody AppointmentDto appointmentDto) {

    }

    @PutMapping("/appointments/{id}")
    public AppointmentDto getAppointmentById(@PathVariable int id) {

    }
}
