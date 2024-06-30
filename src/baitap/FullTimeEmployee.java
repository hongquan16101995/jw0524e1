package baitap;

public class FullTimeEmployee extends Employee implements Taxable {
    private int workingDay;
    private double salaryBasic;

    public FullTimeEmployee(String name, int age, int workingDay, double salaryBasic) {
        super(name, age);
        this.workingDay = workingDay;
        this.salaryBasic = salaryBasic;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Salary of " + this.getName() + " is: " + String.valueOf(this.workingDay * this.salaryBasic));
    }

    @Override
    public double calculateIncomeTax() {
        double salary = this.workingDay * this.salaryBasic;
        if (salary < 11000000) {
            return 0;
        } else if ((salary - 11000000) < 20000000) {
            return salary * 10 / 100;
        } else {
            return salary * 15 / 100;
        }
    }
}
