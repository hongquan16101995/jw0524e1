package bai5;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Integer;

public class MyList {
    public static void main(String[] args) {
        // // Java Collection Framework: tập hợp cấu trúc dữ liệu trong ngôn ngữ Java
        // // CTDL: lưu trữ dữ liệu 1 cách có tổ chức
        // // các loại tập hợp:
        // // List: cấu trúc dạng danh sách
        // // Set: cấu trúc dạng tập hợp, tập hợp các giá trị không trùng lặp
        // // Stack: cấu trúc dạng ngăn xếp, vào trước ra sau (FILO)
        // // Queue: cấu trúc dạng hàng đời, vào trước ra trước (FIFO)
        // // Tree: cấu trúc dang cây, root-leaf trái-leaf phải, leaf trái nhỏ hơn root, leaf phải lớn hơn root
        // // Graph: cấu trúc dạng đồ thị
        // // Map: không thuộc Collection, dạng thư viện được gắn kèm trong Java, key-value

        // // List: tập hợp các phần tử sắp xếp liền kề nhau trên ô nhớ
        // // ArrayList: tồn tại giống dạng mảng, phù hợp vs các tập dữ liệu ít thêm xóa, nhiều truy vấn
        // // LinkedList: tồn tại dưới dạng các Node liên kết, phù hợp vs các tập dữ liệu thường xuyên thêm xóa, ít truy vấn


        // // bt: lưu trữ điểm của 1 học sinh: 6,8,4,9
        // ArrayList<Integer> integers = new ArrayList<>();
        // // ArrayList: tên của lớp tạo đối tượng
        // // <>: dấu kim cương, Generic trong java => dùng để quy định kiểu dữ liệu cho List
        // // như ví dụ trên: danh sách integers chỉ được phép chứa kiểu số nguyên
        // // Integer: lớp Wrapper trong Java, đơn giản là Object hóa các dữ liệu nguyên thủy để sử dụng 1 số phương thức đặc biệt
        // // Tất cả các Collection + Map không sử dụng giá trị thuộc KDL nguyên thủy

        // // Collection sẽ cung cấp rất nhiều các phương thức để hỗ trợ cho lập trình viên sử dụng
        // // thêm giá trị: add(), addAll()
        // integers.add(6);
        // integers.add(4);
        // integers.add(9);
        // integers.add(1,8);
        // System.out.println(integers);
        // System.out.println(integers.size());
        // System.out.println(integers);

        // // duyệt list: sử dụng vòng lặp
        // // duyệt cơ bản: biết số bước lặp và index của phần tử
        // for(int i = 0; i < integers.size(); i++) {
        //     System.out.println(integers.get(i));
        // }

        // // duyệt bằng forEach: chỉ lấy giá trị phần tử, không biết index
        // for(Integer iValue : integers) {
        //     System.out.println(iValue);
        // }

        // bài tập: viết chương trình, cho phép người dùng nhập từ bàn phím
        // tạo ra các số, sau đó thêm vào list. Giới hạn 10 số
        // tính tổng các số đã nhập, tìm số có giá trị cao nhất
        ArrayList<Integer> integerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // // nhập số từ bàn phím
        // for (int i = 0; i < 10; i++) {
        //     System.out.println("Nhập giá trị tại vị trí thứ " + (i+1));
        //     integerList.add(scanner.nextInt());
        // }
        // // duyệt list và xử lý số liệu
        // Integer max = integerList.get(0);
        // Integer sum = 0;
        // for (int i = 0; i < integerList.size(); i++) {
        //     if (max < integerList.get(i)) {
        //         max = integerList.get(i);
        //     }
        //     sum += integerList.get(i);
        // }

        // System.out.println("Giá trị lớn nhất là: " + max);
        // System.out.println("Tổng các số trong list là: " + sum);
        // scanner.close();

        // cách 2
        Integer max = 0;
        Integer sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Nhập giá trị tại vị trí thứ " + (i+1));
            integerList.add(scanner.nextInt());
            if (max < integerList.get(i)) {
                max = integerList.get(i);
            }
            sum += integerList.get(i);
        }
        System.out.println("Giá trị lớn nhất là: " + max);
        System.out.println("Tổng các số trong list là: " + sum);
        scanner.close();

    }

}
