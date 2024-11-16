import java.util.Scanner;

public class third{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("namaste");
                break;
            case 2:
                System.out.println("hello");
                break;
            case 3:
                System.out.println("bonjour");
                break;

            default:
                System.out.println("invalid");
        }
    }
}
