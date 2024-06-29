package com.example.telemedicineSystem.converters;

import com.example.telemedicineSystem.dto.PrescriptionDto;
import com.example.telemedicineSystem.models.Prescription;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PrescriptionConverter {
    public PrescriptionDto entityToDto(Prescription prescription){
        return new PrescriptionDto(
                prescription.getPrescriptionForPatient().getName(),
                prescription.getPrescriptionFromTheDoctor().getName(),
                prescription.getMedication(),
                prescription.getDosage(),
                prescription.getDuration()
        );
    }
}
