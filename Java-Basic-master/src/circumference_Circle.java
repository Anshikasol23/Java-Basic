import java.util.Scanner;

public class circumference_Circle {
    public static void cir_Circle(){
        int c;
        double cir;
        Scanner sc = new Scanner(System.in);
         c = sc.nextInt();
         cir = 2*(3.14)*c;
        System.out.println(cir+" unit");

    }
    public static void main(String[] args){
        cir_Circle();
    }
}
