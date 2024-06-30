package com.example.telemedicineSystem.services;

import com.example.telemedicineSystem.converters.AppointmentConverter;
import com.example.telemedicineSystem.dto.AppointmentDto;
import com.example.telemedicineSystem.repositories.AppointmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final AppointmentConverter appointmentConverter;

    public List<AppointmentDto> findAll() {
        return appointmentRepository.findAll().stream()
                .map(appointmentConverter::entityToDto)
                .toList();
    }
}
