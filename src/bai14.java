import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        System.out.print("Nhap n: ");
        int n = new Scanner(System.in).nextInt();

        System.out.println("Cac so chan nho hon " + n + " la:");
        evenNumbers(n);

        System.out.println("Cac so le nho hon " + n + " la:");
        oddNumbers(n);
    }

    public static void evenNumbers(int n) {
        for (int i = 0; i < n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void oddNumbers(int n) {
        for (int i = 1; i < n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}



