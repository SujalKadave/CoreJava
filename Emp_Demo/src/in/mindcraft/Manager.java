package in.mindcraft;

public class Manager extends Employee {
    private double petrolAllowance;
    private double foodAllowance;
    private double otherAllowance;
    private double grossSalary;
    private double netSalary;

    public Manager(int empId, String name, double basicSalary) {
        super(empId, name, basicSalary);
        calculateGrossSalary();
        calculateNetSalary();
    }

    public void calculateGrossSalary() {
        petrolAllowance = 0.08 * basicSalary;
        foodAllowance = 0.12 * basicSalary;
        otherAllowance = 0.04 * basicSalary;
        grossSalary = basicSalary + petrolAllowance + foodAllowance + otherAllowance;
    }

    public void calculateNetSalary() {
        double pf = 0.125 * basicSalary;
        netSalary = grossSalary - pf;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Petrol Allowance: " + petrolAllowance);
        System.out.println("Food Allowance: " + foodAllowance);
        System.out.println("Other Allowance: " + otherAllowance);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }
}
