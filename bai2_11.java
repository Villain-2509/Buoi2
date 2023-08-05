package Buoi2;

import java.util.Scanner;

public class bai2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        scanner.close();

        double s = 0.0;
        for (int i = 1; i <= n; i++) {
            s += 1.0 / i;
        }

        System.out.println("Tong S = " + s);

        System.out.println("\n=========Villain=========\n");
    }
}
