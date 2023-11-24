import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int l = scanner.nextInt();

        long[][] A = new long[n][m];
        long[][] B = new long[m][l];
        long[][] C = new long[n][l];

        // 行列Aの読み取り
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = scanner.nextLong();
            }
        }

        // 行列Bの読み取り
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < l; j++) {
                B[i][j] = scanner.nextLong();
            }
        }

        // 行列Cの計算
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                for (int k = 0; k < m; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // 行列Cの出力
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                if (j > 0) {
                    System.out.print(" ");
                }
                System.out.print(C[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
