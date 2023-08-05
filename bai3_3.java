package Buoi2;

import java.util.Scanner;

public class bai3_3 {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so N: ");
        int N = scanner.nextInt();

        if (isEven(N)) {
            System.out.println(N + " la so chan.");
        } else {
            System.out.println(N + " la so le.");
        }

        System.out.println("\n=========Villain=========\n");
    }
}
