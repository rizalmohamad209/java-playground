public class CheckForFactor {
    public static void main(String[] args) {
        System.out.println(checkFactor(10, 12));
    }
    private static Boolean checkFactor(int base , int factor){
        if(base % factor ==0){
            return true;
        }else {
            return false;
        }
    }
}
