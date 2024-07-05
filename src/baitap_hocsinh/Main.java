package baitap_hocsinh;

import java.util.Scanner;
import java.util.*;

import baitap_hocsinh.model.Classroom;
import baitap_hocsinh.service.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassroomManage classroomManage = new ClassroomManage();
        StudentManage studentManage = new StudentManage(classroomManage);

        // menu
        menu(scanner, studentManage, classroomManage);
    }

    private static void menu(Scanner scanner, StudentManage studentManage, ClassroomManage classroomManage) {
        do {
            try {
                System.out.println("MENU");
                System.out.println("1. Menu student");
                System.out.println("2. Menu classroom");
                System.out.println("Enter your choice: ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        menuStudent(scanner, studentManage);
                        break;
                    case 2:
                        menuClassroom(scanner, classroomManage, studentManage);
                        break;
                }
            } catch (Exception e) {
                System.out.println("Format error, please again!");
            }
        } while(true);
    }

    private static void menuStudent(Scanner scanner, StudentManage studentManage) {
        do {
            try {
                System.out.println("MENU STUDENT");
                System.out.println("1. Create new Student");
                System.out.println("2. Edit student by id");
                System.out.println("3. Delete student by id");
                System.out.println("4. Display all student");
                System.out.println("5. Display student by classroom");
                System.out.println("0. Exit");
                System.out.println("Enter your choice: ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        studentManage.createNewStudent(scanner);;
                        break;
                    case 4:
                        studentManage.displayAllStudent();
                        break;
                    case 5:
                        studentManage.searchByClassroom(scanner);
                        break;
                }
                if (choice == 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Format error, please again!");
            }
        } while(true);
    }

    private static void menuClassroom(Scanner scanner, ClassroomManage classroomManage, StudentManage studentManage) {
        do {
            try {
                System.out.println("MENU CLASSROOM");
                System.out.println("1. Create new Classroom");
                System.out.println("2. Edit classroom by id");
                System.out.println("3. Display all classroom");
                System.out.println("4. Write text file");
                System.out.println("5. Read text file");
                System.out.println("0. Exit");
                System.out.println("Enter your choice: ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        classroomManage.createNewClassroom(scanner);
                        break;
                    case 2:
                        Classroom classroom = classroomManage.editClassroomById(scanner);
                        studentManage.changeClassroom(classroom);
                        break;
                    case 3:
                        classroomManage.displayAllClassroom();
                        break;
                    case 4:
                        classroomManage.writeFileText();
                        break;
                    case 5:
                        ArrayList<Classroom> classrooms = classroomManage.readFileText();
                        for(Classroom classroom2 : classrooms) {
                            System.out.println(classroom2);
                        }
                        break;
                }
                if (choice == 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Format error, please again!");
            }
        } while(true);
    }
}
