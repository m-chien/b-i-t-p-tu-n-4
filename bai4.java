package baitaptuan4;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        boolean KT = true;
        System.out.println("Nhap so muon kiem tra: ");
        n = sc.nextInt();
        if (n < 2)
            System.out.println("Khong phai so nguyen to!");
        else {
            for (i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    KT = false;
                }
                break;
            }
        }
        if (KT) {
            System.out.println("La so nguyen to!");
        } else {
            System.out.println("Khong phai so nguyen to!");

        }

    }
}
