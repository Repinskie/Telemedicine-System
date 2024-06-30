package com.example.telemedicineSystem.dto;

public record ScheduleDto(
        String dayOfWeek,
        String startTime,
        String endTime,
        String breakStart,
        String breakEnd
) {
}
/*
String doctorName,
String doctorSpecialization,
String cabinet,*/
