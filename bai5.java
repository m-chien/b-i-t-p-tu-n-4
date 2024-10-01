package baitaptuan4;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        int BCNN;
        System.out.println("Nhap vao 2 so: ");
        a = sc.nextInt();
        b = sc.nextInt();
        BCNN = a * b;
        if (a == 0 || b == 0) {
            System.out.println("UCLN la:" + a);
        }
        while (a != b) {
            if (a < b) {
                b -= a;
            } else {
                a -= b;
            }
        }
        System.out.println("UCLN la: " + a);
        BCNN = BCNN / a;
        System.out.println("BCNN la: " + BCNN);
    }
}
