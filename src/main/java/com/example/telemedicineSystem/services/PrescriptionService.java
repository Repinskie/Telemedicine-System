package com.example.telemedicineSystem.services;

import com.example.telemedicineSystem.converters.PrescriptionConverter;
import com.example.telemedicineSystem.dto.PrescriptionDto;
import com.example.telemedicineSystem.repositories.PrescriptionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PrescriptionService {
    private final PrescriptionRepository prescriptionRepository;
    private final PrescriptionConverter prescriptionConverter;

    public List<PrescriptionDto> findAll() {
        return prescriptionRepository.findAll().stream()
                .map(prescriptionConverter::entityToDto)
                .toList();
    }
}
