import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = sc.nextInt();
        int tong=0;
        for (int i = 1; i <= n; i++) tong += i;
        System.out.println(tong);
    }
}
