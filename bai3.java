import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mot so nguyen duong: ");
        int n = sc.nextInt();
        int tong=1;
        for (int i = 1; i <= n; i++) {
            tong*=i;
        }
        System.out.println(tong);
    }
}
