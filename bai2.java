package baitaptuan4;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so cua bang cuu chuong: ");
        int n, i;
        int product;

        n = sc.nextInt();
        for (i = 1; i <= 10; i++) {
            product = i * n;
            System.out.println(i + "*" + n + "=" + product);
        }
    }
}
