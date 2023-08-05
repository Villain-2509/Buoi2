package Buoi2;

public class bai2_7 {
    public static void main(String[] args) {
        System.out.println("\tCHUONG TRINH DEM SO LUONG CAC SO CHIA HET CHO 3 HOAC 7 TRONG KHOANG TU 1 DEN 100:\n");
        
        int c1 = 0;
        int c2 = 0;

        System.out.print("Cac so chia het cho 3 la: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                c1++;
                System.out.print(i + " ");
            }
        }

        System.out.print("\nCac so chia het cho 7 la: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                c2++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\n\nSo luong cac so nguyen chia het cho 3 trong doang tu 1 den 100 la: " + c1);
        System.out.println("So luong cac so nguyen chia het cho 7 trong doang tu 1 den 100 la: " + c2);
        System.out.println("\nTong so luong cac so nguyen chia het cho 3 hoac 7 trong doang tu 1 den 100 la: " + (c1 + c2));

        System.out.println("\n=========Villain=========\n");
    }
}
