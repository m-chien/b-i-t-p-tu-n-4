import java.util.Scanner;
public class b3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        int gt = 1;
        for (int i = 1; i <= n; i++)
        {
            gt *= i;
        }

        System.out.println(n + "! = " + gt);
    }
}

