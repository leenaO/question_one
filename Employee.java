package employee;

public class Employee {

    private String name;
    private String position;
    private double salary;
    private int experience;
    private String educationalLevel;

    public Employee(String name, String position, double salary, int experience, String educationalLevel) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.experience = experience;
        this.educationalLevel = educationalLevel;
    }

    public void calculateSalary(double basicSalary) {
        salary = basicSalary + (basicSalary * (5.0 / 100) * experience);

        if (educationalLevel.equalsIgnoreCase("bachelor")) {
            salary += 500;
        } else if (educationalLevel.equalsIgnoreCase("diploma")) {
            salary += 250;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getEducationalLevel() {
        return educationalLevel;
    }

    public void setEducationalLevel(String educationalLevel) {
        this.educationalLevel = educationalLevel;
    }

}
