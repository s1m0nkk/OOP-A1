import java.util.ArrayList;

public class AssignmentOne {
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3 – Using classes and objects

        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Smith", "Family Medicine", 10, "Downtown Clinic");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Johnson", "Pediatrics", 8, "Uptown Clinic");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Brown", "Internal Medicine", 15, "Suburban Clinic");

        Specialist sp1 = new Specialist(4, "Dr. White", "Cardiology", 12, "Heart Specialist");
        Specialist sp2 = new Specialist(5, "Dr. Green", "Neurology", 20, "Brain Specialist");

        gp1.printDetails();
        System.out.println("------------------------------");
        gp2.printDetails();
        System.out.println("------------------------------");
        gp3.printDetails();
        System.out.println("------------------------------");
        sp1.printDetails();
        System.out.println("------------------------------");
        sp2.printDetails();
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        System.out.println("// Part 5 – Collection of appointments");

        createAppointment("Alice", "123-456-7890", "09:00", gp1);
        createAppointment("Bob", "234-567-8901", "10:00", gp2);
        createAppointment("Charlie", "345-678-9012", "11:00", sp1);
        createAppointment("David", "456-789-0123", "14:00", sp2);

        printExistingAppointments();
        System.out.println("------------------------------");

        cancelBooking("234-567-8901");

        printExistingAppointments();
        System.out.println("------------------------------");
    }

    // 创建新预约并添加到列表
    public static void createAppointment(String patientName, String mobilePhone, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        if (patientName != null && !patientName.isEmpty() && mobilePhone != null && !mobilePhone.isEmpty() && preferredTimeSlot != null && !preferredTimeSlot.isEmpty() && selectedDoctor != null) {
            Appointment appointment = new Appointment(patientName, mobilePhone, preferredTimeSlot, selectedDoctor);
            appointments.add(appointment);
            System.out.println("Appointment created for " + patientName);
        } else {
            System.out.println("Failed to create appointment: Missing required information.");
        }
    }

    // 打印现有预约
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printDetails();
                System.out.println("------------------------------");
            }
        }
    }

    // 取消预约
    public static void cancelBooking(String mobilePhone) {
        boolean found = false;
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getMobilePhone().equals(mobilePhone)) {
                appointments.remove(i);
                System.out.println("Appointment with mobile phone " + mobilePhone + " has been cancelled.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No appointment found with mobile phone " + mobilePhone);
        }
    }
} 