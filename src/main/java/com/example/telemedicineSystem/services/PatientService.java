package com.example.telemedicineSystem.services;

import com.example.telemedicineSystem.converters.PatientConverter;
import com.example.telemedicineSystem.dto.PatientDto;
import com.example.telemedicineSystem.repositories.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;
    private final PatientConverter patientConverter;

    public List<PatientDto> findAll() {
        return patientRepository.findAll().stream()
                .map(patientConverter::entityToDto)
                .toList();
    }
}
