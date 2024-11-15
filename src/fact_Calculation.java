import java.util.Scanner;

public class fact_Calculation {
    public static int cal_Fact(int x){
        int fac=1;
        for(int i=1;i<=x;i++){
            fac=fac*i;
        }
        return fac;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int fact = sc.nextInt();
        System.out.println(cal_Fact(fact));
    }
}
