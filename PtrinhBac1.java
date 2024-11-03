package ptrinhbac1;

import java.util.Scanner;

public class PtrinhBac1 {

    public static void main(String[] args) {
        double a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap he so a: ");
        a = scanner.nextDouble();
        System.out.print("Nhap he so  b: ");
        b = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("phuong trinh co vo so nghiemm");
            } else {
                System.out.println("phuong trinh vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("Phuong trinh co nghiem x = " + x);
        }
    }
}
