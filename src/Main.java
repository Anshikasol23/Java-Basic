import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n= 5;
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                int temp;
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }}
        }
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}