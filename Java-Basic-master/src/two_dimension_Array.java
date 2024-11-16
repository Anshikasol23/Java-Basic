import java.util.Scanner;

public class two_dimension_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[row][cols];
        for(int i=0;i<row;i++){
        for(int j=0;j<cols;j++){
            arr[i][j]= sc.nextInt();
        }
    }
        int x = sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                if(x==arr[i][j]){
                    System.out.println("Element are found at:"+i+","+j);
                }
            }
        }
}}
