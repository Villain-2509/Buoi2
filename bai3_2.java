package Buoi2;

import java.util.Scanner;

public class bai3_2 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ban kinh hinh tron: ");
        double r = scanner.nextDouble();

        // Gọi hàm tính diện tích hình tròn và in kết quả ra màn hình
        double dienTich = tinhDienTichHinhTron(r);
        System.out.println("Dien tich hinh tron voi ban kinh " + r + " la: " + dienTich);

        // Đóng đối tượng Scanner sau khi sử dụng xong
        scanner.close();

        System.out.println("\n=========Villain=========\n");
    }

    // Hàm tính diện tích hình tròn
    public static double tinhDienTichHinhTron(double r) {
        // Diện tích = π * r^2
        double dienTich = Math.PI * r * r;
        return dienTich;
    }
}
