package bai3;

import java.util.Scanner;

public class BTVN2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số bất kỳ: ");
        int number = scanner.nextInt();
        //switch-case
        switch(number)  {
            case 2:
                System.out.println("Tháng " + number + " có 28 hoặc 29 ngày.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + number + " có 30 ngày.");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + number + " có 31 ngày.");
                break;
            default:
                System.out.println(number + " không phải là 1 tháng trong năm!");
        }

        // if
        if (number == 2) {
            System.out.println("Tháng " + number + " có 28 hoặc 29 ngày.");
        } else if (number == 4 || number == 6 || number == 9 || number == 11) {
            System.out.println("Tháng " + number + " có 30 ngày.");
        } else if (number < 1 || number > 12) {
            System.out.println(number + " không phải là 1 tháng trong năm!");
        } else {
            System.out.println("Tháng " + number + " có 31 ngày.");
        }
        scanner.close();
    }
}
