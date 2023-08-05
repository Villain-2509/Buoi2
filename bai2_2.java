package Buoi2;

import java.util.Scanner;

public class bai2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap gia tri N: ");
        int N = scanner.nextInt();

        System.out.print("Nhap gia tri M (M >= N): ");
        int M = scanner.nextInt();

        // Đảm bảo M >= N
        while (N > M) {
            System.out.println("\nGia tri khong hop le. Moi nhap dung gia tri cua M voi dk M >= N!");
            System.out.print("Nhap lai gia tri M: ");
            M = scanner.nextInt();
        }

        System.out.print("Nhap gia tri K: ");
        int K = scanner.nextInt();

        int sum = 0;
        int i;
        System.out.print("\nCac so chia het cho " + K + " la: ");
        for (i = N; i <= M; i++) {
            if (i % K == 0) {
                sum += i;
                System.out.print(i + " ");
            }
        }

        System.out.println("\nTong cac so chia het cho " + K + " trong khoang tu " + N + " den " + M + " la: " + sum);

        scanner.close();

        System.out.println("\n=========Villain=========\n");
    }
}
