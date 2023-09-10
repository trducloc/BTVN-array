import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = new Scanner(System.in).nextInt();

        int[] a = new int[n];
        System.out.println("Nhap cac phan tu cua day: ");
        for (int i = 0; i < n; i++) {
            a[i] = new Scanner(System.in).nextInt();
        }

        if(mangDoiXung(a)){
            System.out.println("Mang vua nhap la mang doi xung");
            return;
        }
        System.out.println("Mang vua nhap khong la mang doi xung");
    }

    public static boolean mangDoiXung(int[] a) {
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            if (a[i] != a[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
