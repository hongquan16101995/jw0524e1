package bai1;

public class Student {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        boolean c = true;
        System.out.println(c || ((a--) > 10)); //True - False
        System.out.println(c | ((b--) > 10)); //True - False
        System.out.println(a); // number
        System.out.println(b); // number
        
    }
}
