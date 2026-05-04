package HospitalManagementSystem;

import java.util.Arrays;
import java.util.Date;

public class Hospital {
    private String name;
    private Doctor[] doctors;
    private int doctorCount;
    private Patient[] patients; 
    private int patientCount;
    private Appointment[] appointments;
    private int appointmentCount;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new Doctor[0];
        this.doctorCount = 0;
        this.patients = new Patient[0];
        this.patientCount = 0;
        this.appointments = new Appointment[0];
        this.appointmentCount = 0;
    }

    
    public void addDoctor(Doctor doctor) {
        doctors = Arrays.copyOf(doctors, doctorCount + 1);
        doctors[doctorCount] = doctor;
        doctorCount++;
    }

   
    public void addPatient(Patient patient) {
        patients = Arrays.copyOf(patients, patientCount + 1);
        patients[patientCount] = patient;
        patientCount++;
    }

   
    private void addAppointment(Appointment appointment) {
        appointments = Arrays.copyOf(appointments, appointmentCount + 1);
        appointments[appointmentCount] = appointment;
        appointmentCount++;
    }

    
    public boolean scheduleAppointment(Doctor doctor, Patient patient, Date dateTime, String notes) {
        // Check if doctor is available at that time (simple check, no conflicts for now)
        Appointment appointment = new Appointment(doctor, patient, dateTime, notes);
        addAppointment(appointment);
        return true;
    }

    
    public boolean scheduleAppointment(String doctorName, Patient patient, Date dateTime, String notes) {
        Doctor doctor = findDoctorByName(doctorName);
        if (doctor != null) {
            return scheduleAppointment(doctor, patient, dateTime, notes);
        }
        return false;
    }

    
    private Doctor findDoctorByName(String name) {
        for (int i = 0; i < doctorCount; i++) {
            if (doctors[i].getName().equals(name)) {
                return doctors[i];
            }
        }
        return null;
    }

    public Patient[] getPatients() {
        return Arrays.copyOf(patients, patientCount);
    }

    
    public Doctor[] getDoctors() {
        return Arrays.copyOf(doctors, doctorCount);
    }

    
    public Appointment[] getAppointments() {
        return Arrays.copyOf(appointments, appointmentCount);
    }

   
    public double generatePatientBill(Patient patient) {
        return patient.generateBill();
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", doctors=" + doctorCount +
                ", patients=" + patientCount +
                ", appointments=" + appointmentCount +
                '}';
    }
}


