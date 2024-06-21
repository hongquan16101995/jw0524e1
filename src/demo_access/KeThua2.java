package demo_access;

import bai6.ChildIn;
import bai6.Parent;

public class KeThua2 {
    public static void main(String[] args) {
        ChildIn childIn = new ChildIn();
        // public
        // không gọi được default do ngoài package
        // không gọi được protected do ngoài package và lớp đang sử dụng không phải là ChildIn

        ChildOut childOut = new ChildOut();

        Parent parent = new Parent();

    }
}
