
package baitaptuan4;

import java.util.Scanner;


public class bai3 {
    public static void main(String[] args) {
        int n, gt = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen duong n: ");
        n = sc.nextInt();
        if (n==0 || n==1){
            gt = 1;
            System.out.println("Giai thua cua n la " + gt );
        }
        else
            for(int i=2; i<=n; i++){
                gt = gt*i;
            }
            System.out.println("Giai thua cua n la " + gt );
    }
}
