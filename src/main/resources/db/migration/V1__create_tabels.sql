-- Schema : telemedicine_schema

-- DROP Schema IF EXISTS Tables
CREATE SCHEMA IF NOT EXISTS telemedicine_schema;
SET schema 'telemedicine_schema';

-- Table: patients
CREATE TABLE IF NOT EXISTS patients
(
    id       BIGSERIAL PRIMARY KEY,
    patient_name VARCHAR(30) NOT NULL,
    patient_email VARCHAR(255) NOT NULL,
    patient_phone VARCHAR(20) NOT NULL,
    patient_medical_history TEXT NOT NULL
);

-- Table : doctors
CREATE TABLE IF NOT EXISTS doctors
(
    id        BIGSERIAL PRIMARY KEY,
    doctor_name VARCHAR(30) NOT NULL,
    doctor_specialization VARCHAR(255) NOT NULL
);

-- Table : appointments
CREATE TABLE IF NOT EXISTS appointments
(
    id       BIGSERIAL PRIMARY KEY,
    appointment_for_patient_id BIGINT,
    appointment_for_doctor_id BIGINT,
    appointment_date DATE NOT NULL,
    appointment_time TIME NOT NULL,
    appointment_status VARCHAR(30) NOT NULL CHECK (appointment_status IN ('SCHEDULED', 'COMPLETED', 'CANCELLED', 'RESCHEDULED')),
    CONSTRAINT fk_appointment_for_patient_id FOREIGN KEY (appointment_for_patient_id) REFERENCES patients (id),
    CONSTRAINT fk_appointment_for_doctor_id FOREIGN KEY (appointment_for_doctor_id) REFERENCES doctors (id)
    );

-- Table : prescriptions
CREATE TABLE IF NOT EXISTS prescriptions
(
    id       BIGSERIAL PRIMARY KEY,
    prescription_for_patient_id BIGINT,
    prescription_from_the_doctor_id BIGINT,
    medication VARCHAR(100) NOT NULL,
    dosage VARCHAR(100) NOT NULL,
    duration VARCHAR(100) NOT NULL,
    CONSTRAINT fk_prescription_for_patient_id FOREIGN KEY (prescription_for_patient_id) REFERENCES patients (id),
    CONSTRAINT fk_prescription_from_the_doctor_id FOREIGN KEY (prescription_from_the_doctor_id) REFERENCES doctors (id)
);

-- Table : schedule
CREATE TABLE IF NOT EXISTS schedules
(
    id       BIGSERIAL PRIMARY KEY,
    schedule_for_doctor_id BIGINT,
    cabinet VARCHAR(5) NOT NULL,
    day_of_week VARCHAR(11) NOT NULL,
    start_time TIME NOT NULL,
    end_time TIME NOT NULL,
    break_start TIME,
    break_end TIME,
    CONSTRAINT fk_schedule_for_doctor_id FOREIGN KEY (schedule_for_doctor_id) REFERENCES doctors (id)
);