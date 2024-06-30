package com.example.telemedicineSystem.controllers;

import com.example.telemedicineSystem.dto.DoctorDto;
import com.example.telemedicineSystem.repositories.DoctorRepository;
import com.example.telemedicineSystem.services.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
@RequiredArgsConstructor
public class DoctorController {
    private final DoctorService doctorService;

    @GetMapping
    public List<DoctorDto> getAllProducts() {
        return doctorService.findAll();
    }

    @GetMapping("/{name}")
    public DoctorDto getDoctorByName(@PathVariable String name) {
        return doctorService.findByName(name);
    }
}
