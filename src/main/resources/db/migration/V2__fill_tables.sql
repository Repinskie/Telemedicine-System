-- Schema : telemedicine_schema

-- Ensure schema is set
SET schema 'telemedicine_schema';

-- Insert test data into patients table
INSERT INTO patients (patient_name, patient_email, patient_phone, patient_medical_history)
VALUES ('John Doe', 'john.doe@example.com', '555-1234', 'No known allergies'),
       ('Jane Smith', 'jane.smith@example.com', '555-5678', 'Diabetes Type 2'),
       ('Alice Johnson', 'alice.johnson@example.com', '555-9012', 'Hypertension'),

       ('Emily White', 'emily.white@example.com', '1231231234', 'Arthritis'),
       ('Michael Green', 'michael.green@example.com', '3213213214', 'Hypertension'),
       ('Sophia Black', 'sophia.black@example.com', '2312312314', 'Diabetes'),
       ('James Blue', 'james.blue@example.com', '3123123124', 'Asthma'),
       ('Olivia Red', 'olivia.red@example.com', '1321321324', 'Heart Disease');

-- Insert test data into doctors table
INSERT INTO doctors (doctor_name, doctor_specialization)
VALUES ('Dr. Gregory House', 'Diagnostic Medicine'),
       ('Dr. Meredith Grey', 'General Surgery'),
       ('Dr. Derek Shepherd', 'Neurosurgery'),

       ('Dr. John Carter', 'Emergency Medicine'),
       ('Dr. Lisa Cuddy', 'Endocrinology'),
       ('Dr. Mark Sloan', 'Plastic Surgery'),
       ('Dr. Izzie Stevens', 'Surgical Oncology'),
       ('Dr. Richard Webber', 'General Surgery');

-- Insert test data into schedules table
INSERT INTO schedules (schedule_for_doctor_id, cabinet, day_of_week, start_time, end_time, break_start, break_end)
VALUES
    (1, '101', 'Monday', '09:00', '17:00', '12:00', '13:00'),
    (1, '101', 'Tuesday', '09:00', '17:00', '12:00', '13:00'),
    (1, '101', 'Wednesday', '09:00', '17:00', '12:00', '13:00'),
    (1, '101', 'Thursday', '09:00', '17:00', '12:00', '13:00'),
    (1, '101', 'Friday', '09:00', '15:00', NULL, NULL),
    (2, '101', 'Monday', '09:00', '17:00', '12:00', '13:00'),
    (2, '101', 'Tuesday', '09:00', '17:00', '12:00', '13:00'),
    (2, '101', 'Wednesday', '09:00', '17:00', '12:00', '13:00'),
    (2, '101', 'Thursday', '09:00', '17:00', '12:00', '13:00'),
    (2, '101', 'Friday', '09:00', '15:00', NULL, NULL),
    (3, '101', 'Monday', '09:00', '17:00', '12:00', '13:00'),
    (3, '101', 'Tuesday', '09:00', '17:00', '12:00', '13:00'),
    (3, '101', 'Wednesday', '09:00', '17:00', '12:00', '13:00'),
    (3, '101', 'Thursday', '09:00', '17:00', '12:00', '13:00'),
    (3, '101', 'Friday', '09:00', '15:00', NULL, NULL),
    (4, '101', 'Monday', '09:00', '17:00', '12:00', '13:00'),
    (4, '101', 'Tuesday', '09:00', '17:00', '12:00', '13:00'),
    (4, '101', 'Wednesday', '09:00', '17:00', '12:00', '13:00'),
    (4, '101', 'Thursday', '09:00', '17:00', '12:00', '13:00'),
    (4, '101', 'Friday', '09:00', '15:00', NULL, NULL),
    (5, '101', 'Monday', '09:00', '17:00', '12:00', '13:00'),
    (5, '101', 'Tuesday', '09:00', '17:00', '12:00', '13:00'),
    (5, '101', 'Wednesday', '09:00', '17:00', '12:00', '13:00'),
    (5, '101', 'Thursday', '09:00', '17:00', '12:00', '13:00'),
    (5, '101', 'Friday', '09:00', '15:00', NULL, NULL),
    (6, '101', 'Monday', '09:00', '17:00', '12:00', '13:00'),
    (6, '101', 'Tuesday', '09:00', '17:00', '12:00', '13:00'),
    (6, '101', 'Wednesday', '09:00', '17:00', '12:00', '13:00'),
    (6, '101', 'Thursday', '09:00', '17:00', '12:00', '13:00'),
    (6, '101', 'Friday', '09:00', '15:00', NULL, NULL),
    (7, '101', 'Monday', '09:00', '17:00', '12:00', '13:00'),
    (7, '101', 'Tuesday', '09:00', '17:00', '12:00', '13:00'),
    (7, '101', 'Wednesday', '09:00', '17:00', '12:00', '13:00'),
    (7, '101', 'Thursday', '09:00', '17:00', '12:00', '13:00'),
    (7, '101', 'Friday', '09:00', '15:00', NULL, NULL),
    (8, '101', 'Monday', '09:00', '17:00', '12:00', '13:00'),
    (8, '101', 'Tuesday', '09:00', '17:00', '12:00', '13:00'),
    (8, '101', 'Wednesday', '09:00', '17:00', '12:00', '13:00'),
    (8, '101', 'Thursday', '09:00', '17:00', '12:00', '13:00'),
    (8, '101', 'Friday', '09:00', '15:00', NULL, NULL);

-- Insert test data into appointments table
INSERT INTO appointments (appointment_for_patient_id, appointment_for_doctor_id, appointment_date, appointment_time,
                          appointment_status)
VALUES (1, 1, '2024-07-01', '10:00', 'SCHEDULED'),
       (2, 2, '2024-07-02', '11:00', 'SCHEDULED'),
       (3, 3, '2024-07-03', '12:00', 'SCHEDULED'),
       (1, 4, '2024-07-01', '14:00', 'COMPLETED'),
       (2, 5, '2024-07-02', '15:00', 'CANCELLED'),
       (3, 6, '2024-07-03', '16:00', 'RESCHEDULED'),

       (4, 7, '2024-07-10', '14:00:00', 'SCHEDULED'),
       (5, 8, '2024-07-11', '15:00:00', 'COMPLETED'),
       (6, 2, '2024-07-12', '16:00:00', 'CANCELLED'),
       (7, 3, '2024-07-13', '17:00:00', 'RESCHEDULED'),
       (8, 4, '2024-07-14', '18:00:00', 'SCHEDULED');

-- Insert test data into prescriptions table
INSERT INTO prescriptions (prescription_for_patient_id, prescription_from_the_doctor_id, medication, dosage, duration)
VALUES (1, 1, 'Ibuprofen', '200mg', '1 week'),
       (2, 2, 'Metformin', '500mg', '2 months'),
       (3, 3, 'Lisinopril', '10mg', '3 months');
