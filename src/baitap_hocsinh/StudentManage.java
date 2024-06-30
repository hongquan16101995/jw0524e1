package baitap_hocsinh;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
    public ArrayList<Student> students = new ArrayList<>();
    private ClassroomManage classroomManage;

    public StudentManage(ClassroomManage classroomManage) {
        this.classroomManage = classroomManage;
    }

    public void displayAllStudent() {
        for(Student student : this.students) {
            System.out.println(student);
        }

        // for(int i = 0; i < students.size(); i++) {
        //     System.out.println(students.get(i));
        // }
    }

    public void createNewStudent(Scanner scanner) {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        int age = getAge(scanner);
        if (age == -1) {
            System.out.println("Error input, please choice again!");
            return;
        }
        String gender = getGender(scanner);
        if (gender == null) {
            System.out.println("Error input, please choice again!");
            return;
        }
        System.out.println("Enter address: ");
        String address = scanner.nextLine();
        System.out.println("Enter pointAvg: ");
        double pointAvg = Double.parseDouble(scanner.nextLine());
        Classroom classroom = getClassroom(scanner);
        if (classroom == null) {
            System.out.println("Error input, please choice again!");
            return;
        }
        Student student = new Student(name, age, gender, address, pointAvg, classroom);
        this.students.add(student);
    }

    private Classroom getClassroom(Scanner scanner) {
        int count = 0;
        do {
            try {
                System.out.println("Enter classroom: ");
                this.classroomManage.displayAllClassroom();
                System.out.println("Enter your choice classroom id: ");
                int choice = Integer.parseInt(scanner.nextLine());
                Classroom classroom = this.classroomManage.getByID(choice);
                if (classroom == null) {
                    System.out.println("Invalid, please enter again!");
                    count++;
                    continue;
                }
                return classroom;
            } catch(Exception e) {
                System.out.println("Format error, please enter again!");
            }
            count++;
        } while(count < 3);
        return null;
    }

    private String getGender(Scanner scanner) {
        int count = 0;
        do {
            try {
                System.out.println("Enter gender: ");
                System.out.println("1. Male");
                System.out.println("2. Female");
                System.out.println("Enter your choice: ");
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1) {
                    return "Male";
                } else if (choice == 2) {
                    return "Female";
                }
                System.out.println("Invalid, please enter again!");
                count++;
                continue;
            } catch(Exception e) {
                System.out.println("Format error, please enter again!");
            }
            count++;
        } while(count < 3);
        return null;
    }

    private int getAge(Scanner scanner) {
        int count = 0;
        int age;
        do {
            try {
                System.out.println("Enter age:");
                age = Integer.parseInt(scanner.nextLine());
                if (age < 7 || age > 18) {
                    System.out.println("Invalid, please enter again!");
                    count++;
                    continue;
                }
                return age;
            } catch (Exception e) {
                System.out.println("Format error, please enter again!");
            }
            count++;
        } while(count < 3);
        return -1;
    }
}
