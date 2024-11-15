public class rhombus_Pattern
 {public static void main(String[] args){
     int j=5;
     int i;
     for(i=1;i<=5;i++){
         for(int k=1;k<=(j-i);k++){
             System.out.print(" ");
         }
        for(int k=0;k<j;k++){
            System.out.print("*");
        }
         System.out.println();
     }
 }
}
