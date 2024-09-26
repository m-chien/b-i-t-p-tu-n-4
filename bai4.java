import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mot so nguyen duong: ");
        int n = sc.nextInt();
        int dem=0;
        for (int i = 2; i < n ; i++) {
            if(n%i==0)
            {
                dem+=1;
                break;
            }
        }
        if (dem==0) System.out.println("la so nguyen to");
        else System.out.println("khong phai so nguyen to");
    }
}
