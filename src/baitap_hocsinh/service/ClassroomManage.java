package baitap_hocsinh.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import baitap_hocsinh.model.*;

public class ClassroomManage {
    public ArrayList<Classroom> classrooms = readFile();

    public ClassroomManage() {
        checkIndex();
    }

    private void checkIndex() {
        if (this.classrooms != null) { 
            if (!this.classrooms.isEmpty()) {
                Classroom.INDEX = this.classrooms.get(this.classrooms.size() - 1).getId();
            }
        } else {
            this.classrooms = new ArrayList<>();
        }
    }

    public boolean checkClassrooms() {
        return this.classrooms.isEmpty();
    }
    
    public void createNewClassroom(Scanner scanner) {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        Classroom classroom = new Classroom(name);
        this.classrooms.add(classroom);
        System.out.println("Create successfully!");
        writeFile();
    }

    public Classroom editClassroomById(Scanner scanner) {
        System.out.println("Enter id you want edit: ");
        int id = Integer.parseInt(scanner.nextLine());
        Classroom classroom = getByID(id);
        if (classroom == null) {
            System.out.println("Not exist classroom have id you choice!");
            return null;
        } else {
            System.out.println("Enter new name:" );
            String name = scanner.nextLine();
            classroom.setName(name);
            System.out.println("Edit successfully!");
            writeFile();
            return classroom;
        }
    }

    public void displayAllClassroom() {
        for(Classroom classroom : this.classrooms) {
            System.out.println(classroom);
        }
    }

    public Classroom getByID(int id) {
        for(Classroom classroom : this.classrooms) {
            if (classroom.getId() == id) {
                return classroom;
            }
        }
        return null;
    }

    private void writeFile() {
        try {
            ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("classrooms"));
            obj.writeObject(this.classrooms);
            obj.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private ArrayList<Classroom> readFile() {
        try {
            ObjectInputStream obj = new ObjectInputStream(new FileInputStream("classrooms"));
            return (ArrayList<Classroom>) obj.readObject();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void writeFileText() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("classrooms.csv"));
            for (Classroom classroom : this.classrooms) {
                String str = classroom.getId() + "," + classroom.getName() + "\n";
                bufferedWriter.write(str);
            }
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Classroom> readFileText() {
        ArrayList<Classroom> classrooms = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("classrooms.csv"));
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                String[] strs = str.split(",");
                classrooms.add(new Classroom(Integer.parseInt(strs[0]), strs[1]));
            }
            return classrooms;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
