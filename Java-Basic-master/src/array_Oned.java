import java.util.Scanner;

public class array_Oned {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i]==x){
                System.out.println("element found at index no.="+arr[i]);
            }
        }
    }
}
