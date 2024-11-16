public class fibonacci_Series {
    public static void main(String[] args){
        int a=0,b=1,c=1,n=10,d=0;
        System.out.print(a+" "+b+" "+c+" ");
        for(int i=1;i<=n;i++){
            d=b+c;
            System.out.print(d+" ");
            b=c;
            c=d;

        }
    }
}
