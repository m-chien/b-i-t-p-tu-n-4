
package baitaptuan4;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        int so1, so2;
        System.out.println("Nhap lan luot vao hai so: ");
        Scanner sc = new Scanner(System.in);
        so1 = sc.nextInt();
        so2 = sc.nextInt();
        int kquc = UCLN(so1, so2);
        System.out.println("Uoc chung lon nhat cua hai so la: " + kquc);
        System.out.println("Boi chung nho nhat cua hai so la: " + BCNN(so1,so2));
    }
    public static int UCLN(int a, int b){
        if(a==b){
            return a;
        }
        else{
            while(a!=b){
                if(a>b){
                    a = a-b;
                }
                else
                    b = b-a;
            }
            return a;
        }
    }
    public static int BCNN(int a, int b){
        int bcnn = (a*b)/UCLN(a,b);
        return bcnn;
    }
}
