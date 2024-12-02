import java.util.Scanner;

public class add_TwoNumber {
    public static int sum_var(int x,int y){
        return (x+y);
    }
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sum_var(a,b));
    }
}
