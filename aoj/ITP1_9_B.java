import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String line = sc.nextLine();
            if (line.equals("-")) break;

            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                int h = sc.nextInt();
                line = line.substring(h) + line.substring(0, h);
            }
            System.out.println(line);
            sc.nextLine(); // 次の入力ラインに移動するため
        }

        sc.close();
    }
}
