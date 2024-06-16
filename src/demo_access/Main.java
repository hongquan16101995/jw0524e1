package demo_access;

import bai4.AccessModifier;

public class Main extends AccessModifier{

    public Main(String a, String b, String c, String d) {
        super(a, b, c, d);
    }

    private void m1() {
        System.out.println(access3);
    }

    public static void main(String[] args) {
        // access modifier
        AccessModifier am = new AccessModifier("a", "b", "c", "d");
        // System.out.println(am.access1);
        // System.out.println(am.access2);
        // System.out.println(am.access3);
        System.out.println(am.access4);
        am.access4 = "ABC";
        System.out.println(am.access4);

        Main main = new Main("a", "b", "c", "d");
        System.out.println(main.access3);
    }
}
