package baitaptuan3;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap Diem TB: ");
        float DTB = scanner.nextFloat();
        if (DTB > 8.5) {
            System.out.println("Xep loai A");
        } else if (DTB > 7) {
            System.out.println("Xep loai B");
        } else if (DTB > 6) {
            System.out.println("Xep Loai C");
        } else if (DTB > 5) {
            System.out.println("Xep Loai D");
        } else {
            System.out.println("Xep Loai F");
        }
        scanner.close();
    }
}
