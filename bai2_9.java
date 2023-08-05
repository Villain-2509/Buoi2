package Buoi2;

import java.util.Scanner;

public class bai2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" CHUONG TRINH TINH TONG S = 1 /1! + 2 /2! + ....+ n / n! ");
        System.out.print("\nNhap n: ");
        int n = sc.nextInt();

        double s = 0;
        double factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i; // tính giai thừa
            s += i / factorial;
        }

        System.out.println("Tong S = " + s);

        sc.close();

        System.out.println("\n=========Villain=========\n");
    }
}
