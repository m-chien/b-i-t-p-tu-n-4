import java.util.Scanner;

public class b5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên thứ nhất: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int b = scanner.nextInt();

        // Tìm UCLN bằng thuật toán Euclid
        int ucln = ucln(a, b);

        // Tính BCNN
        int bcnn = (a * b) / ucln;

        System.out.println("Ước chung lớn nhất: " + ucln);
        System.out.println("Bội chung nhỏ nhất: " + bcnn);
    }

    public static int ucln(int a, int b)
    {
        while (b != 0)
        {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}