import java.util.Scanner;

public class greater_Number {
    public static void grt_NUM(){
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
    public static void main(String[] args){
        grt_NUM();
    }
}
