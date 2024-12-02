import java.util.Scanner;

public class sum_Of_Numbers {
    public static void sumOfNumbers(int x,int y,int z){
        if(y==x){
            System.out.println(z);
            return;
        }
        z=z+x;
        sumOfNumbers(x-1,y,z);
        System.out.println(x);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=0;
        int sum=0;
        int c = sc.nextInt();
        System.out.println("print the sum of "+c+" numbers: ");
        sumOfNumbers(c,a,sum);
    }
}
