import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            y[i] = sc.nextInt();
        }

        System.out.println(minkowskiDistance(x, y, 1));
        System.out.println(minkowskiDistance(x, y, 2));
        System.out.println(minkowskiDistance(x, y, 3));
        System.out.println(minkowskiDistance(x, y, Integer.MAX_VALUE));

        sc.close();
    }

    private static double minkowskiDistance(int[] x, int[] y, int p) {
        if (p == Integer.MAX_VALUE) { // チェビシェフ距離
            int maxDiff = 0;
            for (int i = 0; i < x.length; i++) {
                maxDiff = Math.max(maxDiff, Math.abs(x[i] - y[i]));
            }
            return maxDiff;
        }

        double sum = 0.0;
        for (int i = 0; i < x.length; i++) {
            sum += Math.pow(Math.abs(x[i] - y[i]), p);
        }
        return Math.pow(sum, 1.0 / p);
    }
}
