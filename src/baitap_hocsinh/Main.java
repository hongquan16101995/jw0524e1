package baitap_hocsinh;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassroomManage classroomManage = new ClassroomManage();
        StudentManage studentManage = new StudentManage(classroomManage);

        // menu
        do {
            try {
                System.out.println("MENU");
                System.out.println("1. Create new Student");
                System.out.println("4. Display all student");
                System.out.println("5. Create new Classroom");
                System.out.println("6. Display all classroom");
                System.out.println("7. Ghi danh sách student ra file");
                System.out.println("8. Đọc danh sách student từ file");
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
                        classroomManage.createNewClassroom(scanner);
                        break;
                    case 6:
                        classroomManage.displayAllClassroom();
                        break;
                    case 7:
                        writeFile(studentManage.students);
                        break;
                    case 8:
                        studentManage.students = readFile();
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println("Format error, please enter again!");
            }
        } while(true);
    }

    private static void writeFile(ArrayList<Student> students) {
        try {
            ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("students"));
            obj.writeObject(students);
            obj.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static ArrayList<Student> readFile() {
        try {
            ObjectInputStream obj = new ObjectInputStream(new FileInputStream("students"));
            return (ArrayList<Student>) obj.readObject();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
