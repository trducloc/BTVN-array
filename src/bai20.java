import java.util.Scanner;

public class bai20 {
    public static void main(String[] args) {
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = new Scanner(System.in).nextInt();

        int[] a = new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            a[i] = new Scanner(System.in).nextInt();
        }
        System.out.print("Nhap x: ");
        int x = new Scanner(System.in).nextInt();
        int count = countAppear(a, x);
        System.out.println("So lan xuat hien cua " + x + " trong mang la: " + count);
    }
    public static int countAppear(int[] a, int x) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                count++;
            }
        }
        return count;
    }
}
