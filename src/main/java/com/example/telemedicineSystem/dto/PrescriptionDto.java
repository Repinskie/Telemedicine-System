package com.example.telemedicineSystem.dto;

public record PrescriptionDto(
        String patientName,
        String doctorName,
        String medication,
        String dosage,
        String duration
) {
}
