import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] counts = new int[26]; // アルファベットの各文字のカウント用配列

        while (sc.hasNextLine()) {
            String line = sc.nextLine().toLowerCase(); // 入力を小文字に変換
            for (char c : line.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    counts[c - 'a']++; // 文字に対応するカウントを増やす
                }
            }
        }

        // 各文字の出現回数を出力
        for (int i = 0; i < counts.length; i++) {
            System.out.println((char) (i + 'a') + " : " + counts[i]);
        }

        sc.close();
    }
}