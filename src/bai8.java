import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        System.out.print("Nhap so hang cua ma tran A: ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Nhap so cot cua ma tran A: ");
        int m = new Scanner(System.in).nextInt();

        int[][] a = new int[n][m];

        System.out.println("Nhap cac phan tu cua ma tran A: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = new Scanner(System.in).nextInt();
            }
        }

        System.out.print("Nhap so hang cua ma tran B: ");
        int c = new Scanner(System.in).nextInt();
        System.out.print("Nhap so cot cua ma tran B: ");
        int d = new Scanner(System.in).nextInt();

        if (n != c) {
            System.out.println("Khong the nhan 2 ma tran");
            return;
        }

        int[][] B = new int[c][d];
        int[][] C = new int[n][d];
        System.out.println("Nhap cac phan tu cua ma tran B:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                B[i][j] = new Scanner(System.in).nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < c; k++) {
                    C[i][j] += a[i][k] * B[k][j];
                }
            }
        }
        System.out.println("Ma tran C:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
