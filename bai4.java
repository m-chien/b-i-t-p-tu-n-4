package baitaptuan3;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ba so a, b, c: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int min;
        if (a > b) {
            min = b;
        } else {
            min = a;
        }
        if (min > c) {
            min = c;
            System.out.println("So nho nhat la: " + min);
        } else {
            System.out.println("So nho nhat la: " + min);
        }
        scanner.close();
    }
}