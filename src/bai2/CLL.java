package bai2;

import java.util.Scanner;

public class CLL {
    public static void main(String[] args) {
        // cấu trúc lặp: cấu trúc giúp thực hiện lặp đi lặp lại 1 khối lệnh 
        // trong khi điều kiện lặp còn đúng
        // cấu trúc lặp trong Java:
        // // for: thường dùng trong lệnh lặp đã biết số lần lặp
        // // điều kiện của for thường dựa trên số bước lặp
        // for (int i = 0 ; i <= 10 ; i++) {
        //     System.out.println(i);
        // }

        // // while: thường dùng trong lệnh lặp đã không biết số lần lặp
        // // điều kiện của while thì sẽ ở dạng true/false
        // int j = 20;
        // while (j <= 10) {
        //     System.out.println(j);
        //     j++;
        // }

        // // do...while: giống như while 
        // // nhưng sẽ chắc chắn thực hiện 1 lần trước khi xét điều kiện
        // int k = 20;
        // do {
        //     System.out.println(k);
        //     k++;
        // }
        // while (k <= 10);

        // m1();
    }

    private static void m1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 số");
        int i = sc.nextInt();
        while (i != 10) {
            System.out.println("Nhập 1 số");
            i = sc.nextInt();
        }
        sc.close();
    }
}
