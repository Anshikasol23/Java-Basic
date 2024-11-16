import java.util.Scanner;

public class sum_of_Odd {
    public static void sum(int n){
        int add=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
            add=add+i;}

        }
        System.out.println(add);
        return;
    }
    public static void input(){
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        sum(n);
        return;
    }
    public static void main(String[] args){
        input();
    }
}
