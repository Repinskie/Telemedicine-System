package com.example.telemedicineSystem.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(schema = "telemedicine_schema", name = "appointments")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    private Patient appointmentForPatient;

    @ManyToOne
    private Doctor appointmentForDoctor;

    @Column(name = "appointment_date", nullable = false)
    private Date date;

    @Column(name = "appointment_time", nullable = false)
    private LocalTime time;

    @Column(name = "appointment_status", nullable = false)
    private String status;
}
