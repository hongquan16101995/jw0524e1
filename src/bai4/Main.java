package bai4;

public class Main {
    public static void main(String[] args) {
        // ý 1: khai báo 3 đối tượng
        Student student1 = new Student("A", 28, "Nam", 5);
        Student student2 = new Student("B", 25, "Nữ", 10);
        Student student3 = new Student("C", 22, "Nam", 9);

        // ý 2: hiển thị tên của học viên có điểm cao nhất
        double maxPoint = student1.getPoint();
        String name = student1.getName();
        if (maxPoint < student2.getPoint()) {
            maxPoint = student2.getPoint();
            name = student2.getName();
        }
        
        if (maxPoint < student3.getPoint()) {
            maxPoint = student3.getPoint();
            name = student3.getName();
        }
        System.out.println("Học viên có điểm cao nhất là: " + name);

        // ý 4: hiển thị tên của học viên có tuổi lớn nhất
        double maxAge = student1.getAge();
        Student s = student1;
        if (maxAge < student2.getAge()) {
            s = student2;
        }
        
        if (maxAge < student3.getAge()) {
            s = student3;
        }
        System.out.println("Học viên có tuổi lớn nhất là: " + s.toString());


        // access modifier
        AccessModifier am = new AccessModifier("a", "b", "c", "d");
        // System.out.println(am.access1);
        System.out.println(am.access2);
        System.out.println(am.access3);
        System.out.println(am.access4);
    }
}
