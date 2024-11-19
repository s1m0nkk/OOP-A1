public class Specialist extends HealthProfessional {
    private String specialty;

    public Specialist() {
        super();
        this.specialty = "General";
    }

    public Specialist(int id, String name, String department, int experience, String specialty) {
        super(id, name, department, experience);
        this.specialty = specialty;
    }

    public void printDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();
        System.out.println("Type: Specialist");
        System.out.println("Specialty: " + specialty);
    }
} 