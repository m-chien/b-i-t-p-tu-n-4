package baitaptuan3;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot so: ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("So duong");
        } else if (num < 0) {
            System.out.println("So am");
        } else {
            System.out.println("La so 0");
        }
        scanner.close();
    }
}
