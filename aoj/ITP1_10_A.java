import java.util.Scanner;

class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double x = x2 - x1;
        double y = y2 - y1;
        System.out.println(Math.sqrt(x*x + y*y));

        sc.close();
    }
}
