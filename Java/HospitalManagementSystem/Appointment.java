package HospitalManagementSystem;

import java.util.Date;

public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private Date dateTime;
    private String notes;

    public Appointment(Doctor doctor, Patient patient, Date dateTime, String notes) {
        this.doctor = doctor;
        this.patient = patient;
        this.dateTime = dateTime;
        this.notes = notes;
        doctor.addAppointment(this);
    }

    public Doctor getDoctor() { return doctor; }
    public Patient getPatient() { return patient; }
    public Date getDateTime() { return dateTime; }
    public String getNotes() { return notes; }


    public String toString() {
        return "Appointment{" +
                "doctor=" + doctor.getName() +
                ", patient=" + patient.getName() +
                ", dateTime=" + dateTime +
                ", notes='" + notes + '\'' +
                '}';
    }
}

