package com.example.telemedicineSystem.converters;

import com.example.telemedicineSystem.dto.PatientDto;
import com.example.telemedicineSystem.models.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientConverter {
    public PatientDto entityToDto(Patient patient) {
        return new PatientDto(
                patient.getName(),
                patient.getEmail(),
                patient.getPhone(),
                patient.getMedicalHistory()
        );
    }
}
