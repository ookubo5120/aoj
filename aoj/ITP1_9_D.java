import java.util.Scanner;

class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int q = sc.nextInt();

        for(int i=0; i<q; i++){
            String command = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(command.equals("print")){
                System.out.println(str.substring(a, b+1));
            }else if(command.equals("reverse")){
                String str1 = str.substring(0, a);
                String str2 = str.substring(a, b+1);
                String str3 = str.substring(b+1);
                StringBuffer sb = new StringBuffer(str2);
                sb.reverse();
                str = str1 + sb.toString() + str3;
            }else if(command.equals("replace")){
                String rep = sc.next();
                String str1 = str.substring(0, a);
                String str3 = str.substring(b+1);
                str = str1 + rep + str3;
            }
        }
        sc.close();
    }
}
