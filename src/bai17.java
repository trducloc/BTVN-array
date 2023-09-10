import java.util.Scanner;

public class bai17 {
    public static void main(String[] args) {
        System.out.print("Nhap so dong cua ma tran: ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int m = new Scanner(System.in).nextInt();

        int[][] a = new int[n][m];
        int[][] b = new int[n][m];

        System.out.println("Nhap phan tu ma tran A: ");
        System.out.println("Nhap phan tu ma tran B: ");

        int[][] sum = addMatrix(a, b, n, m);

        System.out.println("Tong 2 ma tran: ");

        printMatrix(sum, n, m);
        inputMatrix(b, n, m);
        inputMatrix(a, n, m);
    }

    public static void inputMatrix(int[][] matrix, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = new Scanner(System.in).nextInt();
            }
        }
    }

    public static int[][] addMatrix(int[][] a, int[][] b, int n, int m) {
        int[][] sum = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }
    public static void printMatrix(int[][] matrix, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
