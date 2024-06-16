package bai4;

public class AccessModifier {
    // AccessModifier: là định nghĩa trong lập trình Java, quy định về phạm vị truy cập 
    // của thành phần của lớp hoặc đối tượng

    // OOP: trong oop có chứa 4 tính chất, ngôn ngữ mà triển khai OOP sẽ cần tuân thủ và đảm bảo 4 tính chất này
    // 4 tính chất: bao gói, đa hình, kế thừa, trừu tượng
    // tính bao gói: thể hiển ở đặc tính của Access modifier, chính là việc quy định phạm vi truy cập của thành phần
    // 4 cấp độ của Access:
    // - private: chỉ sử dụng trong lớp hiện tại
    // - default: sẽ không có từ khóa, chỉ sử dụng trong package hiện tại
    // - protected: chỉ sử dụng trong package hiện tại, có thể truy cập ngoài package nhưng thông qua class con
    // - public: truy cập trên toàn bộ project
    // - private và public là những access thường được sử dụng nhất

    // package: gói trong Java, thường dùng để gom nhóm các lớp có chung mục đích sử dụng

    private String access1;
    String access2;
    protected String access3;
    public String access4;

    public static String staticDemo = "Itplus";

    public AccessModifier(String access1, String access2, String access3, String access4) {
        this.access1 = access1;
        this.access2 = access2;
        this.access3 = access3;
        this.access4 = access4;
    }

    public AccessModifier(String access1, String access2, String access3, String access4, String staticDemo) {
        this.access1 = access1;
        this.access2 = access2;
        this.access3 = access3;
        this.access4 = access4;
        this.staticDemo = staticDemo;
    }

    public static void main(String[] args) {
        AccessModifier am = new AccessModifier("a", "b", "c", "d");
        System.out.println(am.access1);
        System.out.println(am.access2);
        System.out.println(am.access3);
        System.out.println(am.access4);
    }
}
