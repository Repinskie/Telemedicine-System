package com.example.telemedicineSystem.controllers;

import com.example.telemedicineSystem.dto.PrescriptionDto;
import com.example.telemedicineSystem.services.PrescriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/prescriptions")
@RequiredArgsConstructor
public class PrescriptionController {
    private final PrescriptionService prescriptionService;

    @GetMapping
    public List<PrescriptionDto> getAllProducts() {
        return prescriptionService.findAll();
    }
}
