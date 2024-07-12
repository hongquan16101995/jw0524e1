package abaithi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentBackend extends Input implements Search, Activity{
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Student> students = new ArrayList<>();

    private boolean checkIdStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return false;
            }
        }
        return true;
    }

    private Student getStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void searchByName(String name) {
        boolean check = false;
        for (Student s : students) {
            if (s.getName().equals(name)) {
                System.out.println(s);
                check = true;
            }
        }     
        if (!check) {
            System.out.println("Not exist student have name you want!");
        }
    }

    @Override
    public void add() {
        System.out.println("Enter ID: ");
        int id = inputScannerInt();
        boolean check = checkIdStudent(id);
        if (!check) {
            System.out.println("Id exist in list students, please again!");
            return;
        }
        System.out.println("Enter name: ");
        String name = inputScannerString();
        System.out.println("Enter country: ");
        String country = inputScannerString();
        students.add(new Student(id, name, country));
        System.out.println("Create successfully!");
    }

    @Override
    public void edit() {
        System.out.println("Enter ID you want edit: ");
        int id = inputScannerInt();
        Student student = getStudentById(id);
        if (student == null) {
            System.out.println("Id not exist in list students, please again!");
            return;
        }
        System.out.println("Enter new name: " + student.getName());
        String name = inputScannerString();
        student.setName(name);
        System.out.println("Enter new country: " + student.getCountry());
        String country = inputScannerString();
        student.setCountry(country);
        System.out.println("Edit successfully!");
        
    }

    @Override
    public void remove() {
        System.out.println("Enter ID you want remove: ");
        int id = inputScannerInt();
        Student student = getStudentById(id);
        if (student == null) {
            System.out.println("Id not exist in list students, please again!");
            return;
        }
        students.remove(student);
        System.out.println("Delete successfully!");
    }
    
    public void menu() {
        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1. Add");
            System.out.println("2. Edit");
            System.out.println("3. Delete");
            System.out.println("4. Search");
            System.out.println("5. Write to file");
            System.out.println("6. Read file");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = inputScannerInt();
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    remove();
                    break;
                case 4:
                    System.out.println("Enter name you want search: ");
                    String name = scanner.nextLine();
                    searchByName(name);
                    break;
                case 5:
                    writeFile();
                    break;
                case 6:
                    readFile();
                    break;
            }
        } while(choice != 0);
    }

    public void writeFile() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("sinhvien.txt"));
            String value = "";
            for(Student s : students) {
                value += s.getId() + ";" + s.getName() + ";" + s.getCountry() + '\n';
            }
            bufferedWriter.write(value);
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void readFile() {
        ArrayList<Student> studentList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("sinhvien.txt"));
            String value = "";
            while((value = bufferedReader.readLine()) != null) {
                String[] strings = value.split(";");
                studentList.add(new Student(Integer.parseInt(strings[0]), strings[1], strings[2]));
            }
            bufferedReader.close();
            System.out.println("Count student is: " + studentList.size());
            for (Student s : studentList) {
                System.out.println(s);
            }
            students = studentList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
