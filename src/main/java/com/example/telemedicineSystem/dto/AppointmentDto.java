package com.example.telemedicineSystem.dto;

public record AppointmentDto(
        String patientName,
        String doctorName,
        String doctorSpecialization,
        String date,
        String time
) {
}
