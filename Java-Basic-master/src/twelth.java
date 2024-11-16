public class twelth {
    public static void main(String[] args){
        int n=5;
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<i;j++){
            System.out.print("*");}
            for(j=1;j<(2*(n-i));j++){
                System.out.print(" ");}
                for(j=0;j<i;j++){
                    System.out.print("*");
                }
            System.out.println();
        }
        for(i=n-1;i>0;i--){
            for(j=0;j<i;j++){
                System.out.print("*");}
            for(j=1;j<(2*(n-i));j++){
                System.out.print(" ");}
            for(j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
}
}
