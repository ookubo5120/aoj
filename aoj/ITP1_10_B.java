import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double C = Math.toRadians(sc.nextDouble()); // 角度をラジアンに変換

        double S = (a * b * Math.sin(C)) / 2.0; // 面積
        double c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(C)); // 余弦定理で辺cを計算
        double L = a + b + c; // 周の長さ
        double h = 2 * S / a; // 高さ

        System.out.printf("%.8f\n%.8f\n%.8f\n", S, L, h);

        sc.close();
    }
}
