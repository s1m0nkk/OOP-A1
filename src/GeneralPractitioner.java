public class GeneralPractitioner extends HealthProfessional {
    private String clinicLocation;

    public GeneralPractitioner() {
        super();
        this.clinicLocation = "Unknown";
    }

    public GeneralPractitioner(int id, String name, String department, int experience, String clinicLocation) {
        super(id, name, department, experience);
        this.clinicLocation = clinicLocation;
    }

    public void printDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();
        System.out.println("Type: General Practitioner");
        System.out.println("Clinic Location: " + clinicLocation);
    }
} 