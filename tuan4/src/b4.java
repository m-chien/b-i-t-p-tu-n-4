import java.util.Scanner;

public class b4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int n = scanner.nextInt();

        boolean kt = true;
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {
                kt = false;
                break;
            }
        }

        if (kt)
            {
                System.out.println(n + " là số nguyên tố.");
            }
        else
            {
                System.out.println(n + " không phải là số nguyên tố.");
            }
    }
}
