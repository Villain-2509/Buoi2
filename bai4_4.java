package Buoi2;

import java.util.Scanner;

class HocSinh {
    private String hoTen;
    private String lop;
    private double diemTrungBinh;

    public HocSinh(String hoTen, String lop, double diemTrungBinh) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.diemTrungBinh = diemTrungBinh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public String getHoTen() {
        return hoTen;
    }
}

public class bai4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap thong tin hoc sinh A:");
        System.out.print("Ho ten: ");
        String hoTenA = scanner.nextLine();
        System.out.print("Lop: ");
        String lopA = scanner.nextLine();
        System.out.print("Diem trung binh: ");
        double diemTrungBinhA = scanner.nextDouble();
        scanner.nextLine(); // Đọc bỏ dòng mới sau khi nhập số

        System.out.println("\nNhap thong tin hoc sinh B:");
        System.out.print("Ho ten: ");
        String hoTenB = scanner.nextLine();
        System.out.print("Lop: ");
        String lopB = scanner.nextLine();
        System.out.print("Diem trung binh: ");
        double diemTrungBinhB = scanner.nextDouble();

        HocSinh hocSinhA = new HocSinh(hoTenA, lopA, diemTrungBinhA);
        HocSinh hocSinhB = new HocSinh(hoTenB, lopB, diemTrungBinhB);

        if (hocSinhA.getDiemTrungBinh() > hocSinhB.getDiemTrungBinh()) {
            System.out.println("\nHoc sinh " + hocSinhA.getHoTen() + " co diem tb cao hon.");
        } else if (hocSinhA.getDiemTrungBinh() < hocSinhB.getDiemTrungBinh()) {
            System.out.println("\nHoc sinh " + hocSinhB.getHoTen() + " co diem tb cao hon.");
        } else {
            System.out.println("\nHai hoc sinh co cung diem tb.");
        }

        System.out.println("\n=========Villain=========\n");
    }
}
