package bai6.bai6_1;

public class Main {
    public static void main(String[] args) {
        Fly fly = new Concrete();
        fly.m1();
        fly.m2();
        
        Concrete concrete = (Concrete) fly;
    }
}
