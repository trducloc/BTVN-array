import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {

        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = new Scanner(System.in).nextInt();

        int[] a = new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            a[i] = new Scanner(System.in).nextInt();
        }

        System.out.println("So cap phan tu lien tiep bang nhau la: " + count(a));
    }

    public static boolean consecutive(int a, int b) {
        return a == b;
    }

    public static int count(int[] a) {
        int c = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (consecutive(a[i], a[i + 1])) {
                c++;
                if (i + 2 < a.length && consecutive(a[i], a[i + 2])) {
                    c++;
                }
            }
        }
        return c;
    }
}
