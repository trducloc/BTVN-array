import java.util.Scanner;

public class bai18{
    public static void main(String[] args) {
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = new Scanner(System.in).nextInt();

        int[] a = new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            a[i] = new Scanner(System.in).nextInt();
        }
        sortDESC(a);
        System.out.println("Day so giam dan: ");
        show(a);
    }
    public static void sortDESC ( int[] a){
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }
    public static void show(int [] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}