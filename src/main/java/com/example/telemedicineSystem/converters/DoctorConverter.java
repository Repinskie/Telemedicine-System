package com.example.telemedicineSystem.converters;

import com.example.telemedicineSystem.dto.DoctorDto;
import com.example.telemedicineSystem.dto.ScheduleDto;
import com.example.telemedicineSystem.models.Doctor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorConverter {
    private final ScheduleConverter scheduleConverter;
    public DoctorDto entityToDto(Doctor doctor) {
        List<ScheduleDto> scheduleDtos = doctor.getSchedules()
                .stream()
                .map(scheduleConverter::entityToDto)
                .toList();
        return new DoctorDto(doctor.getName(),
                doctor.getSpecialization(),
                scheduleDtos);
    }
}
