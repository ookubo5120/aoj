import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break; // n が 0 の場合は終了

            double[] scores = new double[n];
            double sum = 0.0;

            for (int i = 0; i < n; i++) {
                scores[i] = sc.nextDouble();
                sum += scores[i];
            }

            double mean = sum / n;
            double variance = 0.0;

            for (int i = 0; i < n; i++) {
                variance += (scores[i] - mean) * (scores[i] - mean);
            }
            variance /= n;

            double standardDeviation = Math.sqrt(variance);

            System.out.printf("%.5f\n", standardDeviation);
        }

        sc.close();
    }
}
