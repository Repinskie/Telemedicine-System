package com.example.telemedicineSystem.controllers;

import com.example.telemedicineSystem.dto.PatientDto;
import com.example.telemedicineSystem.services.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
@RequiredArgsConstructor
public class PatientController {
    private final PatientService patientService;

    @GetMapping
    public List<PatientDto> getAllProducts() {
        return patientService.findAll();
    }


}
