
package baitaptuan4;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao so nguyen: ");
        n=sc.nextInt();
        if(KTDX(n)== true)
            System.out.println("Day la so doi xung");
        else    
            System.out.println("Day khong phai so doi xung");
        
    }
    public static boolean KTDX(int so){
        int sodoixung = 0;
        int sophu=so;
        while (so!=0){
            int dem = so%10;
            sodoixung = sodoixung *10 + dem;
            so = so/10;
        }
        if(sodoixung == sophu)
            return true;
        else 
            return false;
    }
}
