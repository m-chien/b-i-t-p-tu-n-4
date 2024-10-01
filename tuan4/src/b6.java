import java.util.Scanner;

public class b6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int n = scanner.nextInt();

        if (kt(n))
        {
            System.out.println(n + " là số đối xứng.");
        }
        else
        {
            System.out.println(n + " không phải là số đối xứng.");
        }
    }

    public static boolean kt(int n)
    {
        int sdn = 0;
        int sbd = n;

        // Đảo ngược số
        while (n != 0)
        {
            int r = n % 10;
            sdn = sdn * 10 + r;
            n /= 10;
        }

        // So sánh số ban đầu và số đã đảo ngược
        return sbd == sdn;
    }
}