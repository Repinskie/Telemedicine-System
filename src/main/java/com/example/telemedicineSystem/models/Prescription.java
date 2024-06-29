package com.example.telemedicineSystem.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(schema = "telemedicine_schema", name = "prescriptions")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    private Patient prescriptionForPatient;

    @ManyToOne
    private Doctor prescriptionFromTheDoctor;

    @Column(name = "medication", nullable = false)
    private String medication;

    @Column(name = "dosage", nullable = false)
    private String dosage;

    @Column(name = "duration", nullable = false)
    private String duration;
}