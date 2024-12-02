import java.util.Scanner;

public class count_Number {
    public static void main(String[] args){
        int n,a,count1=0,count2=0,count3=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            a = sc.nextInt();
            if(a>0){
                   count1=count1+1;

            }
            else if(a==0){
                    count2=count2+1;
            }
            else{
                    count3=count3+1;

            }
        }
        System.out.println("positive="+count1);
        System.out.println("zero="+count2);
        System.out.println("negative="+count3);
    }
}
