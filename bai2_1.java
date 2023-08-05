package Buoi2;

import java.util.Scanner;

public class bai2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so N: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap vao so nguyen duong thu " + (i + 1) + ": ");
            int num = scanner.nextInt();

            if (num % 4 == 0 || (num >= 100 && num / 100 == 3)) {
                sum += num;
            }
        }

        System.out.println("Tong cac so thoa man dk la: " + sum);

        scanner.close();

        System.out.println("\n=========Villain=========\n");
    }
}