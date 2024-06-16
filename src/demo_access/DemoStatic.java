package demo_access;

public class DemoStatic {
    // thành phần static có thể truy cập được thành phần static, nhưng không truy cập được thành phần non-static
    // thành phần non-static có thể truy cập được cả 2: non-static và static
    // lý do: thành phần static được tạo bởi lớp, hình thành cùng thời gian vs lớp nên được tạo trước
    // non-static được tạo sau


    private static String name;
    private String address;

    public void m1() {
        System.out.println(name);
        System.out.println(address);
        m2();
    }

    public static void m2() {
        System.out.println(name);
        // System.out.println(address);
        // m1();
    }
}
