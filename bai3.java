package baitaptuan4;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        int product;
        System.out.println("Nhap so can tinh giai thua: ");
        n = sc.nextInt();
        product = 1;
        for (i = 1; i <= n; i++) {
            product = product * i;
        }
        System.out.println("Giai thua cua n la: " + product);
    }
}
