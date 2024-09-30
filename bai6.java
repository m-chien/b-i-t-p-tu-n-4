package baitaptuan3;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chon phep tinh: ");
        System.out.println("1. Cong");
        System.out.println("2. Tru");
        System.out.println("3. Nhan");
        System.out.println("4. Chia");
        System.out.print("Nhap lua chon cua ban: ");
        int choice = scanner.nextInt();
        System.out.print("Nhap so thu nhat: ");
        double so1 = scanner.nextDouble();
        System.out.print("Nhap so thu hai: ");
        double so2 = scanner.nextDouble();
        double KQ = 0;
        switch (choice) {
            case 1:
                KQ = so1 + so2;
                System.out.println("Ket qua: " + so1 + " + " + so2 + " = " + KQ);
                break;
            case 2:
                KQ = so1 - so2;
                System.out.println("Ket qua: " + so1 + " - " + so2 + " = " + KQ);
                break;
            case 3:
                KQ = so1 * so2;
                System.out.println("Ket qua: " + so1 + " * " + so2 + " = " + KQ);
                break;
            case 4:
                if (so2 != 0) {
                    KQ = so1 / so2;
                    System.out.println("Ket qua: " + so1 + " / " + so2 + " = " + KQ);
                } else {
                    System.out.println("Loi: Khong the chia cho 0.");
                }
                break;
            default:
                System.out.println("Lua chon khong hop le.");
        }

        scanner.close();
    }
}
