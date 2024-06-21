package bai6;

import demo_access.ChildOut;

public class ChildIn extends Parent{
    public static void main(String[] args) {
        ChildIn childIn = new ChildIn();

        ChildOut childOut = new ChildOut();
        // không gọi được default do khác package

        Parent parent = new Parent();

    }

    // lớp con có thể ghi đè phương thức của lớp cha
    // ghi đè: 1 phương thức cùng tên, cùng tham số, cùng cả giá trị trả về với lớp cha
    // khác về phần thân

    @Override
    public void m1() {
        System.out.println("This is ChildIn!");
    }

    public void m2() {
        System.out.println("This is private method!");
    }

}
