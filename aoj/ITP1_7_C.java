import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int c = scanner.nextInt();

        int[][] table = new int[r + 1][c + 1];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                table[i][j] = scanner.nextInt();
                System.out.print(table[i][j]+" ");
                table[i][c] += table[i][j];
                table[r][j] += table[i][j];
                table[r][c] += table[i][j]; // 全要素の合計を計算
            }
            System.out.println(table[i][c]);
            
        }

        for (int j = 0; j <= c; j++) { // 最後の列の合計も含めて出力
            if (j > 0) {
                System.out.print(" ");
            }
            System.out.print(table[r][j]);
        }
        System.out.println();
        scanner.close();
    }
}
//1121
