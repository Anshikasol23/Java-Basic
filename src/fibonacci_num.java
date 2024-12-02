public class fibonacci_num {
    public static void print_Fib(int a,int b,int n){
        if(n==0){
            return;
        }
       int c;
       c=a+b;
        System.out.print(c+" ");
        print_Fib(b,c,n-1);
    }
    public static void main(String[] args){
        int a=0,b=1,n=10;
        System.out.print(a+" "+b+" ");
        print_Fib(a,b,n-2);
    }
}
