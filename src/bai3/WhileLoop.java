package bai3;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
	    while (i++ < 10) {
		    i++;
	    }
	    System.out.println(i);
        // i = 9 / 9 / 10 / 9

        int j = 0;
	    do {
		    j++;
	    } while (j++ < 10);
	    System.out.println(j);
        // j = 10 / 9 / 11 / 11

        // đọc thêm về độ ưu tiên toán tử trong Java

        // continue - break
        // continue: bỏ qua bước lặp hiện tại, chuyển đến bước lặp kế tiếp
        // break: kết thúc vòng lặp khi gặp nó
        System.out.println("----------------");
        for(int k = 0; k < 10; k++) {
            if (k == 5) {
                continue;
            }
            System.out.println(k);
        }
        System.out.println("----------------");
        for(int k = 0; k < 10; k++) {
            if (k == 5) {
                break;
            }
            System.out.println(k);
        }
    }
}
