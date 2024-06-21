package bai6;

import demo_access.ChildOut;

public class KeThua {
    public static void main(String[] args) {
        ChildIn childIn = new ChildIn();
        childIn.m1();

        ChildOut childOut = new ChildOut();
        // public, protected
        // protected do kế thừa
        // không gọi được default, do lớp ChildOut nằm ngoài package

        Parent parent = new Parent();
        parent.m1();
        // public, protected, default
        // protected gọi được là do đang trong cùng 1 package

        System.out.println("-----------------");
        Parent p1 = new Parent();
        Parent p2 = new ChildIn();
        ChildIn c1 = new ChildIn();
        p1.m1(); // this is parent // m1
        p2.m1(); // this is childin // m1
        c1.m1(); // this is childin // m1,m2
    
        ChildIn c2 = (ChildIn) p2;
        c2.m2();
        ChildIn c3 = (ChildIn) p1;
        c3.m2();
    }
}
