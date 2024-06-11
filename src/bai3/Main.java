package bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // sử dụng từ khóa new để gọi đến constructor tạo đối tượng
        Person person1 = new Person();
        Person person2 = new Person("Quân", 29, "Nam");
        Person person3 = new Person("Nguyễn Thị B", 20, "Nữ", "HCM");

        // sử dụng các phương thức để truy vấn giá trị thuộc tính
        // System.out.println(person1.getName());
        // System.out.println(person2.getName());
        // System.out.println(person2.getAddress());
        // person2.setAddress("HN");
        // System.out.println(person2.getAddress());

        // ví dụ phương thức
        System.out.println("Nhập trạng thái: ");
        int check = person3.canEat(sc.nextLine());
        if (check == 1) {
            System.out.println(person3.getName() + " an duoc nua");
        } else if (check == 0) {
            System.out.println(person3.getName() + " no roi, khong an nua");
        } else {
            System.out.println("StatusError");
        }
    }
}
