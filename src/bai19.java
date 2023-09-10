import java.util.Scanner;

public class bai19 {
    public static void main(String[] args) {
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = new Scanner(System.in).nextInt();

        int[] a = new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            a[i] = new Scanner(System.in).nextInt();
        }
        countEvenOdd(a);
    }

    public static void countEvenOdd(int[] a) {
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i]; j++) {
                if (a[i] % 2 == 0) {
                    evenCount++;
                }

                if (a[i] % 2 != 0) {
                    oddCount++;
                }
            }
        }
        System.out.println("So luong so chan trong mang la " + evenCount);
        System.out.println("Số luong so le trong mang la " + oddCount);
    }
}

