package HospitalManagementSystem;

import java.util.Arrays;

public class Doctor {
    private String name;
    private String specialization;
    private double consultationFee;
    private Appointment[] appointments; 
    private int appointmentCount;

    public Doctor(String name, String specialization, double consultationFee) {
        this.name = name;
        this.specialization = specialization;
        this.consultationFee = consultationFee;
        this.appointments = new Appointment[0];
        this.appointmentCount = 0;
    }

    
    public String getName() { return name; }
    public String getSpecialization() { return specialization; }
    public double getConsultationFee() { return consultationFee; }
    public Appointment[] getAppointments() { return Arrays.copyOf(appointments, appointmentCount); }

    
    public void addAppointment(Appointment appointment) {
        appointments = Arrays.copyOf(appointments, appointmentCount + 1);
        appointments[appointmentCount] = appointment;
        appointmentCount++;
    }

    
    public void removeAppointment(Appointment appointment) {
        for (int i = 0; i < appointmentCount; i++) {
            if (appointments[i].equals(appointment)) {
                for (int j = i; j < appointmentCount - 1; j++) {
                    appointments[j] = appointments[j + 1];
                }
                appointments = Arrays.copyOf(appointments, appointmentCount - 1);
                appointmentCount--;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", consultationFee=" + consultationFee +
                '}';
    }
}
