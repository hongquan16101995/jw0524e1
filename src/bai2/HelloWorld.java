// package: hiểu là gói trong Java, gom nhóm các lớp có tính chất giống hoặc gần giống nhau
package bai2;

// import: giúp tham chiếu lớp hiện tại đến 1 thư viện trong JDK
// 1 số thư viện: java.ulti ; java.lang ; java.io ; java.net ; java.sql
import java.lang.System;
import java.util.Scanner;

//trong 1 file .java chỉ chứa 1 class public duy nhất trùng tên vs tên file
// class: chỉ định đây là 1 lớp + định danh tên của lớp đó
public class HelloWorld {
    // phương thức siêu main của Java
    // trong 1 chương trình Java chỉ chứa 1 siêu main
    // đây là phương thức đầu tiên được gọi khi chương trình Java chạy
    // cách tạo: main + phím Tab ; psvm + phím Tab
    public static void main(String[] args) {
        // // đầu ra của chương trình Java: màn hình console
        // System.out.println("HelloWorld");
        // System.out.print(123);
        // System.out.println("HelloWorld9999");
        // System.out.println("HelloWorld1111");
        // printf: print format

        // đầu vào của chương trình Java: màn hình console
        // lớp để đón dữ liệu đầu vào: lớp Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số: ");
        int number = scanner.nextInt();
        int bp = number * number;
        System.out.println(bp);
        scanner.close();

        // tạo 1 biến chứa số, nhập số đó từ bàn phím, in ra bình phương của số đó

    }
}
