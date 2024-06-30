package com.example.telemedicineSystem.repositories;

import com.example.telemedicineSystem.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
    @Query("select d from Doctor d where d.name = :name")
    Optional<Doctor> findByName(String name);
}
