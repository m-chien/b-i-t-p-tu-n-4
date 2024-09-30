package baitaptuan3;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ba canh cua tam giac a, b, c: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a + b > c && b + c > a && a + c > b) {
            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("Tam giac vuong");
            } else if (a == b && b == c) {
                System.out.println("Tam giac deu");
            } else if (a == b || b == c || c == a) {
                System.out.println("Tam giac can");
            } else if (a * a > b * b + c * c || b * b > a * a + c * c || c * c > a * a + b * b) {
                System.out.println("Tam giac Tu");
            } else {
                System.out.println("Tam giac Nhon");
            }
        } else {
            System.out.println("Khong phai la tam giac");
        }
        scanner.close();
    }
}
