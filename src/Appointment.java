public class Appointment {
    private String patientName;
    private String mobilePhone;
    private String preferredTimeSlot;
    private HealthProfessional selectedDoctor;

    public Appointment() {
        this.patientName = "Unknown";
        this.mobilePhone = "000-000-0000";
        this.preferredTimeSlot = "00:00";
        this.selectedDoctor = null;
    }

    public Appointment(String patientName, String mobilePhone, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.preferredTimeSlot = preferredTimeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void printDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile Phone: " + mobilePhone);
        System.out.println("Preferred Time Slot: " + preferredTimeSlot);
        if (selectedDoctor != null) {
            System.out.println("Selected Doctor Details:");
            selectedDoctor.printDetails();
        } else {
            System.out.println("No doctor selected.");
        }
    }
} 