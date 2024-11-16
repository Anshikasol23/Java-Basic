public class parsing_Concept_Two {
    public static void main(String[] args){
        String str = "123";
        try{
            int number = Integer.parseInt(str);
            System.out.println(number);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
}
