public class string_Builder {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("Tony");
        System.out.println(str);
        System.out.println(str.charAt(0));//T
        str.setCharAt(0,'R');//Rony
        System.out.println(str);
        str.insert(2,'n');
        System.out.println(str);
        str.delete(2,3);
        System.out.println(str);//Rony
        //append - last end
        String str2 = "hello";
        System.out.println(str2);
        System.out.println(str.length());


    }
}
