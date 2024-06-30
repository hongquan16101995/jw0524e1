package baitap;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // <? extends E>
        ArrayList<Employee> employees = new ArrayList<>(); 

        // PartTimeEmployee partTimeEmployee = new PartTimeEmployee("A", 20, 200, 25000);
        // FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("B", 30, 20, 1000000);
        
        // employees.add(partTimeEmployee);
        // employees.add(fullTimeEmployee);

        // for (Employee e : employees) {
        //     if (e instanceof PartTimeEmployee) {
        //         PartTimeEmployee partTime = (PartTimeEmployee) e;
        //         partTime.calculateIncomeTax();
        //         partTime.calculateSalary();
        //     } else if (e instanceof FullTimeEmployee) {
        //         FullTimeEmployee fullTime = (FullTimeEmployee) e;
        //     }
        // }

        do {
            System.out.println("MENU");
            System.out.println("1. Create a FullTimeEmployee");
            System.out.println("2. Create a PartTimeEmployee");
            System.out.println("3. Display salary and tax FullTimeEmployee");
            System.out.println("4. Display salary and tax PartTimeEmployee");
            System.out.println("5. Display salary and tax Employee");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            int choice = getInt(scanner);
            if (choice == -1) {
                continue;
            }

            switch (choice) {
                case 1:
                    createFullTimeEmployee(scanner, employees);
                    break;
                case 2:
                    createPartTimeEmployee(scanner, employees);
                    break;
                case 3:
                    
                    break;
            
                case 4:
                    
                    break;
            
                case 5:
                    displayEmployee(employees);
                    break;
                case 0:
                    System.out.println("End process!");
                    System.exit(0);
            }
        } while(true);
    }

    public static void createFullTimeEmployee(Scanner scanner, ArrayList<Employee> employees) {
        System.out.println("FullTime Employee Infomation: ");
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());
        int workingDay;
        do {
            System.out.println("Enter working day: ");
            workingDay = getInt(scanner);
        } while (workingDay == -1);
        System.out.println("Enter salary basic: ");
        double salaryBasic = Double.parseDouble(scanner.nextLine());
        employees.add(new FullTimeEmployee(name, age, workingDay, salaryBasic));
    }

    public static void createPartTimeEmployee(Scanner scanner, ArrayList<Employee> employees) {
        System.out.println("PartTime Employee Infomation: ");
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter working hour: ");
        int workingHour = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter salary hour: ");
        double salaryHour = Double.parseDouble(scanner.nextLine());
        employees.add(new PartTimeEmployee(name, age, workingHour, salaryHour));
    }


    public static void displayEmployee(ArrayList<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            System.out.print(employees.get(i).getName() + " - ");
            if (employees.get(i) instanceof FullTimeEmployee) {
                System.out.print("Tax: " + ((FullTimeEmployee)employees.get(i)).calculateIncomeTax() + " - ");
            }
            employees.get(i).calculateSalary();
        }
    }

    public static int getInt(Scanner scanner) {
        int number = -1;
        // khối try: là khối cố gắng thực thi điều gì đó
        try {
            number = Integer.parseInt(scanner.nextLine());
            // khối catch: là khối bắt lỗi nếu khối try có lỗi
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("Error format! Please again!");
        }
        return number;
    }
}
