
package baitaptuan4;

import java.util.Scanner;


public class bai1 {
    public static void main(String[] args) {
        int tong, n;
        tong =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        n = sc.nextInt();
        for (int i=1; i<=n; i++){
            tong = tong + i;
        }
        System.out.println("Tong cac so tu 1 den n la " + tong);
    }
}
