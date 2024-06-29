package com.example.telemedicineSystem.repositories;

import com.example.telemedicineSystem.models.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {
}
