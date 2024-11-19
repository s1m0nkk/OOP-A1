public class HealthProfessional {
    private int id;
    private String name;
    private String department;
    private int experience;

    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.department = "General";
        this.experience = 0;
    }

    public HealthProfessional(int id, String name, String department, int experience) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.experience = experience;
    }

    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Experience: " + experience + " years");
    }
} 