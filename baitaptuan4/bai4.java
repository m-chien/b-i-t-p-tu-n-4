
package baitaptuan4;

import java.util.Scanner;

public class bai4 {
    public static boolean KTNTO(int n){
        if(n<=1){
            return false;
        }
        else
            for(int i =2; i<=Math.sqrt(n); i++){
                if(n%i==0)
                    return false;
            }
            return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int so;
        System.out.println("Nhap vao mot so: ");
        so = sc.nextInt();
        if(KTNTO(so))
            System.out.println(so + " la mot so nguyen to ");
        else
            System.out.println(so + " khong phai la so nguyen to");
    }
}

