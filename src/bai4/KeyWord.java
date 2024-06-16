package bai4;

public class KeyWord {
    // final: cuối cùng, dùng để khai báo cho hằng số
    // static
    // abstract: đại diện cho trừu tượng, gắn với phương thức hoặc class, để chuyển Pt và class thành trừu tượng
    // extends: từ khóa dùng trong kế thừa, 
            //được hiểu là lớp bên trái sẽ kế thừa các thành phần có thể của lớp bên phải
    // implements: triển khai, dùng để triển khai các phương thức trong lớp thuần trừu tượng <=> interface
    // void: dạng trả về đặc biệt của phương thức, khi phương thức không chứa giá trị trả về
    // return: từ khóa để phương thức trả về 1 giá trị cụ thể nào đó. không bh đi cùng void
    // args <=> arguments: đối số; giá trị truyền vào tham số
    // parameter: tham số, biến của phương thức, khai báo khi khai báo phương thức nếu có

    // FINAL: CUỐI CÙNG
    // từ khóa này có thể gắn vs thuộc tính, biến, phương thức, class
    // giá trị mặc định của kiểu dữ liệu: giá trị sinh ra khi biến mang KLD đó không được khai báo giá trị nào
    // biến chứa giá trị mặc định: biến global
    // final phương thức: là không phép ghi đè phương thức
    // final class: là không cho phép kế thừa class

    int number1;

    public void m1() {
        final int number2 = 10;
        final Student student = new Student("abc", 10, "nam", 8);
        // number2 = 20;
        student.setName("demo");
        System.out.println(student.getName());
        System.out.println(number1); // 0
        System.out.println(number2);
    }

    public static void main(String[] args) {
        KeyWord keyWord = new KeyWord();
        // keyWord.m1();

        // STATIC: cho các thành phần có thể được truy cập bởi lớp thay vì đối tượng
        // biến Static
        // phương thức Static
        // block Static
        // class Static => inner class
        AccessModifier accessModifier1 = new AccessModifier("a", "b", "c", "10", "abc");
        AccessModifier accessModifier2 = new AccessModifier("a", "b", "c", "d", "123");
        System.out.println(AccessModifier.staticDemo);
        System.out.println(accessModifier1.staticDemo);
        System.out.println(accessModifier1.access4);
        System.out.println(accessModifier2.staticDemo);
        System.out.println(accessModifier2.access4);
    }
}
