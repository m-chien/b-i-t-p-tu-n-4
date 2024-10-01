package baitaptuan4;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int chuso, DN = 0, So;

        System.out.println("Nhap so tu nhien can kiem tra: ");
        n = sc.nextInt();
        So = n;

        while (n > 0) {
            chuso = n % 10;
            DN = DN * 10 + chuso;
            n = n / 10;
        }

        if (DN == So) {
            System.out.println("La so doi xung");
        } else {
            System.out.println("Khong la so doi xung");
        }

        sc.close();
    }
}
