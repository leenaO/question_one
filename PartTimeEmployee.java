package employee;

public class PartTimeEmployee extends Employee{
    double bonus;
    
    public PartTimeEmployee(String name, String position, double salary, int experience, String educationalLevel) {
        super(name, position, salary, experience, educationalLevel);
    }
    
    
    public double calculateBonus(double basicSalary){
        bonus= basicSalary*0.015;
        return bonus;
    }
    
    
}
