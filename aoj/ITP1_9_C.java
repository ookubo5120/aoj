import java.util.Scanner;

class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int taropoint = 0;
        int hanakopoint = 0;

        for(int i=0; i<n; i++){
            String taro = sc.next();
            String hanako = sc.next();

            if(taro.compareTo(hanako) > 0){
                taropoint += 3; 
            }else if(taro.compareTo(hanako) < 0){
                hanakopoint += 3;
            }else{
                taropoint += 1;
                hanakopoint += 1;
            }
        }
        System.out.println(taropoint + " " + hanakopoint);

        sc.close();
    }
}
