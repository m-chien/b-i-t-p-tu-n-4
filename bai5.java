import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap hai so a,b :");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c=a, d=b;
        while (a!=b)
        if (a>b) a=a-b;
        else b=b-a;
        System.out.println("UCLN la: " +a);
        System.out.println("BCNN la: "+(c*d)/a);
    }
}
