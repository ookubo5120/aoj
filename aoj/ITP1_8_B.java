import java.util.Scanner;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            BigInteger x = sc.nextBigInteger();  // BigIntegerを使用
            if (x.equals(BigInteger.ZERO)) break;
            int sum = 0;
            BigInteger tmp = x;

            while (tmp.compareTo(BigInteger.ZERO) > 0) {
                sum += tmp.mod(BigInteger.TEN).intValue();
                tmp = tmp.divide(BigInteger.TEN);
            }
            System.out.println(sum);
        }

        sc.close();
    }
}
