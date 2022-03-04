public class ReversedStrings {
    public static void main(String[] args) {
        System.out.println(reverseString("world"));
    }
    public static String reverseString(String str){
        String nstr="";

        for(int i= str.length()-1 ;i>=0; i--){
            nstr += str.charAt(i);



        }
        return nstr;


    }
}
