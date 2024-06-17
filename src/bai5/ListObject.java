    package bai5;

    import java.util.ArrayList;
    import java.util.List;

    import bai4.Student;

    public class ListObject {
        public static void main(String[] args) {
            ArrayList<Student> studentList = new ArrayList<>();
            Student studentObject = new Student("a", 10, "nam",6);
            studentList.add(studentObject);
            Student demo = studentList.get(0);
            System.out.println(demo.getAge());
        }
    }
