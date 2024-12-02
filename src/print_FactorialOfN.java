import java.util.Scanner;

public class print_FactorialOfN{
        public static void factorial(int x,int y,int z){
            if(y==x){
                System.out.println(z);
                return;
            }
            z=z*x;
            factorial(x-1,y,z);
            System.out.println(x);

        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a=1;
            int fact=1;
            int c = sc.nextInt();
            System.out.println("print the factorial of "+c+" numbers: ");
            factorial(c,a,fact);
        }
    }


