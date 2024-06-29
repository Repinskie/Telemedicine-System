package com.example.telemedicineSystem.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(schema = "telemedicine_schema", name = "patients")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "patient_name", nullable = false)
    private String name;

    @Column(name = "patient_email", nullable = false)
    private String email;

    @Column(name = "patient_phone", nullable = false)
    private String phone;

    @Column(name = "patient_medical_history", nullable = false)
    private String medicalHistory;

    @OneToMany(mappedBy = "appointmentForPatient", cascade = {CascadeType.ALL})
    @JsonIgnore
    private List<Appointment> patientAppointments;

    @OneToMany(mappedBy = "prescriptionForPatient", cascade = {CascadeType.ALL})
    @JsonIgnore
    private List<Prescription> patientPrescriptions;
}
