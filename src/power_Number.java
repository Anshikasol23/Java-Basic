import java.util.Scanner;

public class power_Number {
    public static void pow_Num(int x,int y){
        int pow=x;
        for(int i=1;i<y;i++){
            pow=pow*x;
        }
        System.out.println(pow);
    }
    public static void main(String[] args){
        int n,p;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        p = sc.nextInt();
        pow_Num(n,p);
    }
}
