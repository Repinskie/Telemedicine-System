package com.example.telemedicineSystem.controllers;

import com.example.telemedicineSystem.converters.AppointmentConverter;
import com.example.telemedicineSystem.dto.AppointmentDto;
import com.example.telemedicineSystem.dto.StringResponse;
import com.example.telemedicineSystem.models.Appointment;
import com.example.telemedicineSystem.services.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appointments")
@RequiredArgsConstructor
public class AppointmentController {
    private final AppointmentService appointmentService;
    private final AppointmentConverter appointmentConverter;

    @GetMapping
    public List<AppointmentDto> getAllAppointments() {
        return appointmentService.findAll();
    }

    @PostMapping("/create")
    public ResponseEntity<?> createAppointment(@RequestBody AppointmentDto appointmentDto) {
        Appointment appointment = appointmentConverter.dtoToEntity(appointmentDto);
        return ResponseEntity.ok(new StringResponse(appointmentService.createAppointment(appointment)));
    }
}
