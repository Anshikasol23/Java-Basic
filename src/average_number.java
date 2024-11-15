import java.util.Scanner;

public class average_number {
    public static void input(){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        average(a,b,c);
    }
    public static void average(int x,int y,int z){
        int avg;
        avg = (x+y+z)/3;
       display(avg);
    }
    public static void display(int w){
        System.out.println(w);
    }
    public static void main(String[] args){
        input();

    }
}
