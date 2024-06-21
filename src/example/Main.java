package example;

public class Main {
    public static void main(String[] args) {
        Classroom demoClass = new Classroom("JW0524E1");
        Classroom classroom1 = new Classroom("JW0624E1");
        Student student = new Student("Quang", 20, demoClass);
        Student student2 = new Student("Tiến", 23, demoClass);

        Smartphone smartphone = new Smartphone("Nokia");
        // student và student2 IS-A Student
        // student và students HAS-A Classroom
        student.useSmartPhone(smartphone);
        System.out.println(student.name + " study " + student.classroom.name);
    }
}
