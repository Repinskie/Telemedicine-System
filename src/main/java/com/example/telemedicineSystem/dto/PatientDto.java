package com.example.telemedicineSystem.dto;

public record PatientDto(
        String name,
        String email,
        String phoneNumber,
        String medicalHistory
) {
}
