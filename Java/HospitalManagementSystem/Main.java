package HospitalManagementSystem;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        
        Hospital hospital = new Hospital("City General Hospital");

       
        Doctor drSmith = new Doctor("Dr. Ali", "Cardiology", 150.0);
        Doctor drJohnson = new Doctor("Dr. Umair", "Neurology", 200.0);
        hospital.addDoctor(drSmith);
        hospital.addDoctor(drJohnson);

        
        Date tenDaysAgo = new Date(System.currentTimeMillis() - 10 * 24 * 60 * 60 * 1000L);
        Date fiveDaysAgo = new Date(System.currentTimeMillis() - 5 * 24 * 60 * 60 * 1000L);
        Date sixtyDaysAgo = new Date(System.currentTimeMillis() - 60 * 24 * 60 * 60 * 1000L);
        Inpatient inpatient1 = new Inpatient("Saad", 70, "Heart Disease", tenDaysAgo, 101, 100.0);
        Outpatient outpatient1 = new Outpatient("Babar", 45, "Migraine", fiveDaysAgo, 50.0);
        Outpatient outpatient2 = new Outpatient("Ahmed", 75, "Arthritis", sixtyDaysAgo, 60.0); 

        hospital.addPatient(inpatient1);
        hospital.addPatient(outpatient1);
        hospital.addPatient(outpatient2);

       
        Date tomorrow = new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000L);
        hospital.scheduleAppointment(drSmith, inpatient1, tomorrow, "Follow-up checkup");
        hospital.scheduleAppointment("Dr. Umair", outpatient1, new Date(tomorrow.getTime() + 2 * 60 * 60 * 1000L), "Initial consultation");

        
        outpatient1.addVisit();

        
        System.out.println("=== Hospital Management System Demo ===");
        System.out.println(hospital);

        System.out.println("\n=== Patients ===");
        for (Patient patient : hospital.getPatients()) {
            System.out.println(patient);
            System.out.println("Bill: Rs" + hospital.generatePatientBill(patient));
        }

        System.out.println("\n=== Doctors and Appointments ===");
        for (Doctor doctor : hospital.getDoctors()) {
            System.out.println(doctor);
            System.out.println("Appointments:");
            for (Appointment app : doctor.getAppointments()) {
                System.out.println("  " + app);
            }
        }
    }
}



