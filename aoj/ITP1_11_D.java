import java.util.Scanner;

class Main {
    private static int[] roll_front(int[] a){
        int[] res=new int[6];
        res[0]=a[4];
        res[1]=a[0];
        res[2]=a[2];
        res[3]=a[3];
        res[4]=a[5];
        res[5]=a[1];
        return res;
    }
    private static int[] roll_back(int[] a){
        int[] res=new int[6];
        res[0]=a[1];
        res[1]=a[5];
        res[2]=a[2];
        res[3]=a[3];
        res[4]=a[0];
        res[5]=a[4];
        return res;
    }
    private static int[] roll_left(int[] a){
        int[] res=new int[6];
        res[0]=a[2];
        res[1]=a[1];
        res[2]=a[5];
        res[3]=a[0];
        res[4]=a[4];
        res[5]=a[3];
        return res;
    }
    private static int[] roll_right(int[] a){
        int[] res=new int[6];
        res[0]=a[3];
        res[1]=a[1];
        res[2]=a[0];
        res[3]=a[5];
        res[4]=a[4];
        res[5]=a[2];
        return res;
    }
    private static int[] rotate_right(int[] a){
        int[] res=new int[6];
        res[0]=a[0];
        res[1]=a[3];
        res[2]=a[1];
        res[3]=a[4];
        res[4]=a[2];
        res[5]=a[5];
        return res;
    }
    private static boolean same_dice(int[] a,int[] b){
        boolean res=false;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                boolean is_same=true;
                for(int k=0;k<6;k++)if(a[k]!=b[k])is_same=false;
                if(is_same)res=true;
                a=rotate_right(a);
            }
            a=roll_front(a);
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                boolean is_same=true;
                for(int k=0;k<6;k++)if(a[k]!=b[k])is_same=false;
                if(is_same)res=true;
                a=rotate_right(a);
            }
            a=roll_right(a);
        }
        return res;
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[][] a=new int[n][6];
        for(int i=0;i<n;i++){
            for(int j=0;j<6;j++){
                a[i][j]=scan.nextInt();
            }
        }
        boolean exi=false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(same_dice(a[i],a[j])){
                    exi=true;
                }
            }
        }
        if(!exi)System.out.println("Yes");
        else System.out.println("No");
        scan.close();
    }
}
