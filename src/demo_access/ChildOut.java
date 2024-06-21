package demo_access;

import bai6.ChildIn;
import bai6.Parent;

public class ChildOut extends Parent{
    public static void main(String[] args) {
        ChildIn childIn = new ChildIn();
        // public
        // không gọi được default do ngoài package
        // không gọi được protected do ngoài package và lớp đang sử dụng không phải là ChildIn

        ChildOut childOut = new ChildOut();
        // public, protected
        // gọi được protected do đây là lớp kế thừa trực tiếp từ Parent
        // không gọi được default do nằm ngoài package

        Parent parent = new Parent();

    }
}
