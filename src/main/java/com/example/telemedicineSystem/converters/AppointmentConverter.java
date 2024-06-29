package com.example.telemedicineSystem.converters;

import com.example.telemedicineSystem.dto.AppointmentDto;
import com.example.telemedicineSystem.models.Appointment;
import com.example.telemedicineSystem.utils.DateTimeConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentConverter {
    public AppointmentDto entityToDto(Appointment appointment){
        return new AppointmentDto(
                appointment.getAppointmentForPatient().getName(),
                appointment.getAppointmentForDoctor().getName(),
                appointment.getAppointmentForDoctor().getSpecialization(),
                DateTimeConverter.dateFormatToString(appointment.getDate()),
                DateTimeConverter.timeFormatToString(appointment.getTime())
        );
    }
}
