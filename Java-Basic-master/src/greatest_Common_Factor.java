import java.util.Scanner;

public class greatest_Common_Factor {
    static void gcd(int n1,int n2){
        int hcf=1;
        for(int i=1;i<=n1&&i<=n2;i++){
            if(n1%i==0&&n2%i==0){
                hcf=i;
            }
            System.out.println(hcf);
        }
    }
    public static void main(String[] args){
        int n1,n2;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        gcd(n1,n2);
    }
}
