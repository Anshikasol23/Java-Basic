public class clear_Bit {
    public static void main(String[] args){
        int n=5;
        int i=2;//pos
        int bitMask = 1<<i;
        int not = ~(bitMask);
        System.out.println(not&n);
        if((not&n)==0){
            System.out.println("bit is zero");
        }else{
            System.out.println("bit is one");
        }
    }
}
