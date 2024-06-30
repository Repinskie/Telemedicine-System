package com.example.telemedicineSystem.converters;

import com.example.telemedicineSystem.dto.ScheduleDto;
import com.example.telemedicineSystem.models.Schedule;
import com.example.telemedicineSystem.utils.DateTimeConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScheduleConverter {
    public ScheduleDto entityToDto(Schedule schedule){
        return new ScheduleDto(
                schedule.getDayOfWeek(),
                DateTimeConverter.timeFormatToString(schedule.getStartTime()),
                DateTimeConverter.timeFormatToString(schedule.getEndTime()),
                DateTimeConverter.timeFormatToString(schedule.getBreakStart()),
                DateTimeConverter.timeFormatToString(schedule.getBreakEnd())
        );
    }
}
