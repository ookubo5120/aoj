import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String w = sc.nextLine().toLowerCase(); // 小文字に変換
        int count = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.equals("END_OF_TEXT")) {
                break;
            }

            String[] words = line.toLowerCase().split("\\s+"); // 小文字に変換して単語に分割
            for (String word : words) {
                if (word.equals(w)) {
                    count++;
                }
            }
        }

        System.out.println(count);

        sc.close();
    }
}
