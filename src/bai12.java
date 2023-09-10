import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {

        System.out.print("Nhap so dong va cot cua ma tran: ");
        int n = new Scanner(System.in).nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a[ " + i + "][" + j + "] = ");
                a[i][j] = new Scanner(System.in).nextInt();
            }
        }
        int sum = sumDiagonal(a, n);
        System.out.println("Tong duong cheo chinh cua ma tran: " + sum);

    }
    public static int sumDiagonal(int[][] a, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i][i];
        }
        return sum;
    }
}
