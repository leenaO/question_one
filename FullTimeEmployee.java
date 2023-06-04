package employee;

public class FullTimeEmployee extends Employee {

    double bonus;

    public FullTimeEmployee(String name, String position, double salary, int experience, String educationalLevel) {
        super(name, position, salary, experience, educationalLevel);
    }

    public double calculateBonus(double basicSalary) {
        bonus = basicSalary * 0.03;
        return bonus;
    }

}
