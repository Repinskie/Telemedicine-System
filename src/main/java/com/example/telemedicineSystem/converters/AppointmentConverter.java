package com.example.telemedicineSystem.converters;

import com.example.telemedicineSystem.dto.AppointmentDto;
import com.example.telemedicineSystem.exceptions.ResourceNotFoundException;
import com.example.telemedicineSystem.models.Appointment;
import com.example.telemedicineSystem.models.Doctor;
import com.example.telemedicineSystem.models.Patient;
import com.example.telemedicineSystem.repositories.DoctorRepository;
import com.example.telemedicineSystem.repositories.PatientRepository;
import com.example.telemedicineSystem.utils.DateTimeConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentConverter {
    private final PatientRepository patientRepository;
    private final DoctorRepository doctorRepository;

    public AppointmentDto entityToDto(Appointment appointment){
        return new AppointmentDto(
                appointment.getAppointmentForPatient().getName(),
                appointment.getAppointmentForDoctor().getName(),
                appointment.getAppointmentForDoctor().getSpecialization(),
                DateTimeConverter.dateFormatToString(appointment.getDate()),
                DateTimeConverter.timeFormatToString(appointment.getTime()),
                appointment.getStatus()
        );
    }

    public Appointment dtoToEntity(AppointmentDto dto){
        Patient patient = patientRepository.findByName(dto.patientName()).orElseThrow(
                () -> new ResourceNotFoundException("Patient not found"));
        Doctor doctor = doctorRepository.findByName(dto.doctorName()).orElseThrow(
                () -> new ResourceNotFoundException("Doctor not found"));

        return new Appointment(
                null,
                patient,
                doctor,
                DateTimeConverter.stringToDateFormat(dto.date()),
                DateTimeConverter.stringToTimeFormat(dto.time()),
                dto.status()
        );
    }
}
