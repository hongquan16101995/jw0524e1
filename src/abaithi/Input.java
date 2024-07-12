package abaithi;

import java.util.Scanner;

public class Input {
    public int inputScannerInt() {
        Scanner sc = new Scanner(System.in);
        int value = -1;
        do {
            try {
                value = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Format error!");
                System.out.println(e.getMessage());
            }
        } while (value == -1);
        return value;
    }

    public String inputScannerString() {
        Scanner sc = new Scanner(System.in);
        String value = "";
        do {
            try {
                value = sc.nextLine();
            } catch (Exception e) {
                System.out.println("Format error!");
            }
        } while (value == "");
        return value;
    }
}
