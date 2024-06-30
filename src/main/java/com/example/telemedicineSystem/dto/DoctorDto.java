package com.example.telemedicineSystem.dto;

import java.util.List;

public record DoctorDto(
        String doctorName,
        String doctorSpecialization,
        List<ScheduleDto> schedule
) {
}
