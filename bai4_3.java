package Buoi2;

import java.util.Scanner;

class SinhVien {
    private String hoTen;
    private String lop;
    private int maSV;
    private String gioiTinh;
    private int tuoi;
    private String diaChi;
    private String email;
    private String sdt;
    private float diemToan;
    private float diemVan;

    // Constructors
    public SinhVien() {
    }

    public SinhVien(String hoTen, String lop, int maSV) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.maSV = maSV;
    }

    public SinhVien(String hoTen, String lop, int maSV, String gioiTinh, int tuoi, String diaChi) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.maSV = maSV;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }

    public SinhVien(String hoTen, String lop, int maSV, String gioiTinh, int tuoi, String diaChi, String email) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.maSV = maSV;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.email = email;
    }

    public SinhVien(String hoTen, String lop, int maSV, String gioiTinh, int tuoi, String diaChi, String email, String sdt) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.maSV = maSV;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.email = email;
        this.sdt = sdt;
    }

    // Getters and Setters
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(float diemVan) {
        this.diemVan = diemVan;
    }

    // Phương thức nhập thông tin sinh viên
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ho ten: ");
        this.hoTen = scanner.nextLine();

        System.out.print("Nhap lop: ");
        this.lop = scanner.nextLine();

        System.out.print("Nhap ma sv: ");
        this.maSV = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap gtinh: ");
        this.gioiTinh = scanner.nextLine();

        System.out.print("Nhap tuoi: ");
        this.tuoi = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap dia chi: ");
        this.diaChi = scanner.nextLine();

        System.out.print("Nhap email: ");
        this.email = scanner.nextLine();

        System.out.print("Nhap sdt: ");
        this.sdt = scanner.nextLine();

        System.out.print("Nhap diem Toan: ");
        this.diemToan = Float.parseFloat(scanner.nextLine());

        System.out.print("Nhap diem Van: ");
        this.diemVan = Float.parseFloat(scanner.nextLine());
    }

    // Phương thức hiển thị đầy đủ thông tin sinh viên
    public void hienThiThongTin() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Lop: " + lop);
        System.out.println("Ma sv: " + maSV);
        System.out.println("Goi tinh: " + gioiTinh);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Email: " + email);
        System.out.println("Sdt: " + sdt);
        System.out.println("Diem Toan: " + diemToan);
        System.out.println("Diem Van: " + diemVan);
        System.out.println("========================");
    }
}

public class bai4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong sv: ");
        int n = Integer.parseInt(scanner.nextLine());

        SinhVien[] dsSinhVien = new SinhVien[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap thong tin sv thu " + (i + 1) + ":");
            dsSinhVien[i] = new SinhVien();
            dsSinhVien[i].nhapThongTin();
        }

        System.out.println("\nDanh sach sv:");
        for (SinhVien sv : dsSinhVien) {
            sv.hienThiThongTin();
        }

        System.out.println("\n=========Villain=========\n");
    }
}
