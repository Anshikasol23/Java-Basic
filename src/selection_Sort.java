import java.util.Scanner;

public class selection_Sort {
    public static void main(String[] args){
        int n=5;
        int smallest=0;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                smallest = arr[0];
                if(smallest>arr[i+1]){
                    smallest=arr[i+1];
                }
            }
            int temp = arr[0];
            arr[0] = smallest;
            smallest = temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
