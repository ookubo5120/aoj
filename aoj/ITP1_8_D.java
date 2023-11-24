import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String p = sc.nextLine();

        String doubledS = s + s; // リング状の文字列をシミュレート

        if (doubledS.contains(p)) { // 文字列 p が doubledS に含まれているかチェック
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
