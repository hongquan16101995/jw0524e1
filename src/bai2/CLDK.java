package bai2;

import java.util.Scanner;

public class CLDK {
    public static void main(String[] args) {
        // // if đơn: if + điều kiện => thực thi khi đk đúng
        // int n1 = 10;
        // if (n1 < 5) {
        //     System.out.println("True 1");
        // }
        // System.out.println("------------");

        // // if else: if +  điều kiện + else => thực thi mệnh đề if khi đk đúng
        // // thực thi mệnh đề else khi đk sai
        // int n2 = 10;
        // if (n2 < 20) {
        //     System.out.println("True 2");
        // } else {
        //     System.out.println("False 2");
        // }
        // System.out.println("------------");

        // // if else if (if bậc thang): if1 + đ.k1 + else1 + {if2 đ.k2 + else2(nếu cần)}
        // // thực thi mệnh đề if1 khi đ.k1 đúng
        // // thực thi mệnh đề if2 khi đ.k1 sai + đ.k2 đúng
        // // thực thi mệnh đề else2 khi đ.k1 sai + đ.k2 sai
        // int n31 = 10;
        // int n32 = 1;
        // if (n31 > 7) {
        //     System.out.println("True 3.1");
        // } else {
        //     if (n32 > 2) {
        //         System.out.println("True 3.2");
        //     } else {
        //         System.out.println("False 3");
        //     }
        // }
        
        // // if lồng: if1 + đ.k1 + {if2 đ.k2 + else2(nếu cần)} + else1(nếu cần)
        // // thực thi mệnh đề if2 khi đ.k1 đúng + đ.k2 đúng
        // // thực thi mệnh đề else2 khi đ.k1 đúng + đ.k2 sai
        // // thực thi mệnh đề else1 khi đ.k1 sai
        // int n41 = 10;
        // int n42 = 5;
        // if (n41 > 15) {
        //     if (n42 > 2) {
        //         System.out.println("True 4");
        //     } else {
        //         System.out.println("False 4.1");
        //     }   
        // } else {
        //     System.out.println("False 4.2");
        // }   

        // switch-case: phù hợp cho điều kiện so sánh bằng vs nhiều kết quả khác nhau
        // vd: nhập vào giá tiền => tên quả
        // nhập 1 tháng => số ngày trong tháng
        System.out.println("Nhập giá hoa quả:");
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        switch (price) {
            case 40:
                System.out.println("Quả ổi");
                break;
            case 20:
                System.out.println("Quả hồng");
                break;
            case 10:
                System.out.println("Quả cam");
                break;
            case 60:
                System.out.println("Quả mít");
                break;
            default:
                System.out.println("Không có quả phù hợp");
                break;
        }
        scanner.close();

        // 40: quả ổi
        // 20: quả hồng, quả hồng + không có quả phù hợp, quả hồng + qủa cam
    }
}
