package baitaptuan3;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap he so a, b, c: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Phuong trinh co dang: " + a + "x^2 + " + b + "x + " + c + " = 0");
        if (a == 0)
            if (b != 0) {
                float x = -(float) c / b;
                System.out.println("x la:" + x);
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        else {
            float delta = b * b - 4 * a * c;
            if (delta > 0) {
                System.out.println("PT co 2 nghiem phan biet la: ");
                float x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
                float x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("x1= " + x1 + "x2= " + x2);
            } else if (delta == 0) {
                System.out.println("PT co nghiem kep: ");
                float x = (float) -b / 2 * a;
                System.out.println("x= " + x);
            } else {
                System.out.println("PT vo nghiem");
            }

        }

        scanner.close();
    }
}
