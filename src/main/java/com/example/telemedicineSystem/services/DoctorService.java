package com.example.telemedicineSystem.services;

import com.example.telemedicineSystem.converters.DoctorConverter;
import com.example.telemedicineSystem.dto.DoctorDto;
import com.example.telemedicineSystem.exceptions.ResourceNotFoundException;
import com.example.telemedicineSystem.models.Doctor;
import com.example.telemedicineSystem.repositories.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class DoctorService {
    private final DoctorRepository doctorRepository;
    private final DoctorConverter doctorConverter;

    public List<DoctorDto> findAll() {
        return doctorRepository.findAll().stream()
                .map(doctorConverter::entityToDto)
                .toList();
    }

    public DoctorDto findByName(String name) {
        Doctor doctor = doctorRepository.findByName(name).orElseThrow(
                () -> new ResourceNotFoundException("Doctor with name " + name + " not found"));
        return doctorConverter.entityToDto(doctor);
    }
}
