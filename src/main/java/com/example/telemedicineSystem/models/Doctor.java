package com.example.telemedicineSystem.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(schema = "telemedicine_schema", name = "doctors")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "doctor_name", nullable = false)
    private String name;

    @Column(name = "doctor_specialization", nullable = false)
    private String specialization;

    @OneToMany(mappedBy = "appointmentForDoctor", cascade = {CascadeType.ALL})
    @JsonIgnore
    private List<Appointment> doctorAppointments;

    @OneToMany(mappedBy = "prescriptionFromTheDoctor", cascade = {CascadeType.ALL})
    @JsonIgnore
    private List<Prescription> doctorPrescriptions;

    @OneToMany(mappedBy = "scheduleForDoctor", cascade = {CascadeType.ALL})
    @JsonIgnore
    private List<Schedule> schedules;
}
