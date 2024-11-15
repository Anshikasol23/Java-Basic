public class set_Bit
{

        public static void main(String[] args){
            int n=5;
            int i=1;//pos
            int bitMask = 1<<i;
            System.out.println(bitMask|n);
            if((bitMask|n)==0){
                System.out.println("bit is zero");
            }else{
                System.out.println("bit is one");
            }
    }
}
