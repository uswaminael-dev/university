# Hospital Management System UML Class Diagram

```plantuml
@startuml HospitalManagementSystem

class Doctor {
    - name: String
    - specialization: String
    - consultationFee: double
    - appointments: Appointment[]
    - appointmentCount: int
    + Doctor(name: String, specialization: String, consultationFee: double)
    + getName(): String
    + getSpecialization(): String
    + getConsultationFee(): double
    + getAppointments(): Appointment[]
    + addAppointment(appointment: Appointment): void
    + removeAppointment(appointment: Appointment): void
    + toString(): String
}

abstract class Patient {
    - name: String
    - age: int
    - disease: String
    - admissionDate: LocalDate
    + Patient(name: String, age: int, disease: String, admissionDate: LocalDate)
    + getName(): String
    + getAge(): int
    + getDisease(): String
    + getAdmissionDate(): LocalDate
    + generateBill(): double
    + isSeniorCitizen(): boolean
    + isLongTermPatient(): boolean
    + toString(): String
}

class Inpatient {
    - roomNumber: int
    - dailyRoomCharge: double
    + Inpatient(name: String, age: int, disease: String, admissionDate: LocalDate, roomNumber: int, dailyRoomCharge: double)
    + generateBill(): double
    + getRoomNumber(): int
    + getDailyRoomCharge(): double
    + toString(): String
}

class Outpatient {
    - visitCount: int
    - visitCharge: double
    + Outpatient(name: String, age: int, disease: String, admissionDate: LocalDate, visitCharge: double)
    + addVisit(): void
    + generateBill(): double
    + getVisitCount(): int
    + getVisitCharge(): double
    + toString(): String
}

class Appointment {
    - doctor: Doctor
    - patient: Patient
    - dateTime: LocalDateTime
    - notes: String
    + Appointment(doctor: Doctor, patient: Patient, dateTime: LocalDateTime, notes: String)
    + getDoctor(): Doctor
    + getPatient(): Patient
    + getDateTime(): LocalDateTime
    + getNotes(): String
    + toString(): String
}

class Hospital {
    - name: String
    - doctors: Doctor[]
    - doctorCount: int
    - patients: Patient[]
    - patientCount: int
    - appointments: Appointment[]
    - appointmentCount: int
    + Hospital(name: String)
    + addDoctor(doctor: Doctor): void
    + addPatient(patient: Patient): void
    + scheduleAppointment(doctor: Doctor, patient: Patient, dateTime: LocalDateTime, notes: String): boolean
    + scheduleAppointment(doctorName: String, patient: Patient, dateTime: LocalDateTime, notes: String): boolean
    + getAppointmentsOnDate(date: LocalDate): Appointment[]
    + getPatients(): Patient[]
    + getDoctors(): Doctor[]
    + getAppointments(): Appointment[]
    + generatePatientBill(patient: Patient): double
    + toString(): String
}

Doctor ||-- Appointment : composition
Hospital o-- Doctor : aggregation
Hospital o-- Patient : aggregation
Hospital o-- Appointment : aggregation
Appointment --> Doctor
Appointment --> Patient
Patient <|-- Inpatient
Patient <|-- Outpatient

@enduml
```

## Implementation Details

### Doctor Class
- Manages doctor's information and their appointments.
- Uses composition with Appointment class.

### Patient Class (Abstract)
- Base class for all patients.
- Provides common attributes and methods.
- Includes discount logic for seniors and long-term patients.

### Inpatient Class
- Extends Patient for hospitalized patients.
- Billing based on room charges and days admitted.
- Applies discounts for seniors and long-term stays.

### Outpatient Class
- Extends Patient for non-hospitalized patients.
- Billing based on visit count and charges.
- Supports multiple follow-up visits.

### Appointment Class
- Represents scheduled appointments.
- Links doctor and patient with date/time and notes.

### Hospital Class
- Central management class.
- Uses aggregation for doctors, patients, and appointments.
- Provides overloaded methods for scheduling appointments.
- Manages billing and appointment queries.