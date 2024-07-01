package com.example.telemedicineSystem.repositories;

import com.example.telemedicineSystem.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
    @Query("select p from Patient p where p.name = :name")
    Optional<Patient> findByName(String name);
}
