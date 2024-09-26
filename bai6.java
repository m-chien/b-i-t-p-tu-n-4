import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mot so nguyen duong: ");
        int n = sc.nextInt();
        int a=n;
        int tg=0;
        while(a%10!=0)
        {
            tg+=1;
            a=a/10;
        }
        int dem=0;
        System.out.println(tg);
        for (int i = 1; i <= tg/2; i++) {
            if ((int)(n/Math.pow(10,tg-i)%10)!=(int)(n%Math.pow(10,i)/Math.pow(10,i-1)))
            {
                dem+=1;
                break;
            }
        }
        if (dem==0) System.out.println("la so doi xung");
        else System.out.println("la so khong doi xung");
    }
}
