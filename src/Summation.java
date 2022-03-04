public class Summation {
    public static void main(String[] args) {
        System.out.println(summation(8));
    }

    public static int summation(int n) {
        int result=0;
        for(int i=1;i<= n;i++){
            result += i;
        }
        return result;
    }
}
