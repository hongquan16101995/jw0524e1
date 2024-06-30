package baitap;

public class PartTimeEmployee extends Employee implements Taxable {
    private int workingHour;
    private double salaryHour;

    public PartTimeEmployee(String name, int age, int workingHour, double salaryHour) {
        super(name, age);
        this.workingHour = workingHour;
        this.salaryHour = salaryHour;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Salary of " + this.getName() + " is: " + String.valueOf(this.workingHour * this.salaryHour));
    }

    @Override
    public double calculateIncomeTax() {
        double salary = this.workingHour * this.salaryHour;
        if (salary < 2000000) {
            return 0;
        }  else {
            return salary * 7 / 100;
        }
        
    }
}
