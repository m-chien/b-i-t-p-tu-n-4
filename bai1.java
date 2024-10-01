package baitaptuan4;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum, i;
        System.out.println("Nhap so tu nhien n: ");
        n = sc.nextInt();
        System.out.println("In ra day so: ");
        sum = 0;
        for (i = 1; i <= n; i++) {
            sum += i;
            System.out.println(i);
        }
        System.out.println("Tong day so la:" + sum);
    }
}
