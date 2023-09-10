import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = new Scanner(System.in).nextInt();

        int[] a = new int[n];
        System.out.println("Nhap cac phan tu cua day: ");

        for (int i = 0; i < n; i++) {
            a[i] = new Scanner(System.in).nextInt();
        }

        System.out.print("Nhap b: ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("Nhap c: ");
        int c = new Scanner(System.in).nextInt();


        double tbc = TBC(a, b, c);
        System.out.println("Trung binh cong cac phan tu trong doan [" + b + ", " + c + "] la: " + tbc);
    }

    public static double TBC(int[] a, int b, int c) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= b && a[i] <= c) {
                sum += a[i];
                count++;
            }
        }
        return sum / count;
    }
}
