package baitap_hocsinh.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import baitap_hocsinh.model.*;

public class StudentManage {
    public ArrayList<Student> students = readFile();
    private ClassroomManage classroomManage;

    public StudentManage(ClassroomManage classroomManage) {
        this.classroomManage = classroomManage;
        checkIndex();
    }

    private void checkIndex() {
        if (this.students != null) { 
            if (!this.students.isEmpty()) {
                Student.INDEX = this.students.get(this.students.size() - 1).getId();
            }
        } else {
            this.students = new ArrayList<>();
        }
    }

    public void displayAllStudent() {
        for(Student student : this.students) {
            System.out.println(student);
        }
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
        // xử lý classroom
        boolean check = classroomManage.checkClassrooms();
        if (check) {
            System.out.println("List classroom is empty!");
            System.out.println("1. Create new classroom");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 0) {
                return;
            } else if (choice == 1) {
                classroomManage.createNewClassroom(scanner);
            }
        }
        Classroom classroom = getClassroom(scanner);
        if (classroom == null) {
            System.out.println("Error input, please choice again!");
            return;
        }
        Student student = new Student(name, age, gender, address, pointAvg, classroom);
        this.students.add(student);
        writeFile();
    }

    public void changeClassroom(Classroom classroom) {
        for (Student student : this.students) {
            if (student.getClassroom().getId() == classroom.getId()) {
                student.setClassroom(classroom);
            }
        }
        writeFile();
    }

    public void searchByClassroom(Scanner scanner) {
        System.out.println("Enter classroom id you want search: ");
        int id = Integer.parseInt(scanner.nextLine());
        Classroom classroom = classroomManage.getByID(id);
        if (classroom == null) {
            System.out.println("Not exist classroom have id!");
            return;
        }
        for (Student student : this.students) {
            if (student.getClassroom().getId() == id) {
                System.out.println(student);
            }
        }
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

    private void writeFile() {
        try {
            ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("students"));
            obj.writeObject(this.students);
            obj.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private ArrayList<Student> readFile() {
        try {
            ObjectInputStream obj = new ObjectInputStream(new FileInputStream("students"));
            return (ArrayList<Student>) obj.readObject();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
