package com.example.telemedicineSystem.services;

import com.example.telemedicineSystem.converters.ScheduleConverter;
import com.example.telemedicineSystem.dto.ScheduleDto;
import com.example.telemedicineSystem.repositories.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;
    private final ScheduleConverter scheduleConverter;

    public List<ScheduleDto> findAll() {
        return scheduleRepository.findAll().stream()
                .map(scheduleConverter::entityToDto)
                .toList();
    }
}
