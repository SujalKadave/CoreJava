package in.mindcraft;

public class MarketExecutive extends Employee {
    private int kilometersTravelled;
    private double tourAllowance;
    private final double telephoneAllowance = 2000;
    private double grossSalary;
    private double netSalary;

    public MarketExecutive(int empId, String name, double basicSalary, int kilometersTravelled) {
        super(empId, name, basicSalary);
        this.kilometersTravelled = kilometersTravelled;
        calculateGrossSalary();
        calculateNetSalary();
    }

    public void calculateGrossSalary() {
        tourAllowance = kilometersTravelled * 5.0;
        grossSalary = basicSalary + tourAllowance + telephoneAllowance;
    }

    public void calculateNetSalary() {
        double pf = 0.125 * basicSalary;
        netSalary = grossSalary - pf;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Kilometers Travelled: " + kilometersTravelled);
        System.out.println("Tour Allowance: " + tourAllowance);
        System.out.println("Telephone Allowance: " + telephoneAllowance);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }
}
