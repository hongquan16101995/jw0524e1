package example;

public class Student {
    public String name;
    public int age;

    public Classroom classroom;

    public Student(String name, int age, Classroom classroom) {
        this.name = name;
        this.age = age;
        this.classroom = classroom;
    }

    public void useSmartPhone(Smartphone smartphone) {
        System.out.println(this.name + " use " + smartphone.name);
    }
}
