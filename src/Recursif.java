public class Recursif {
    public static void main(String[] args) {
        int number = 4,result;
        result = factorial(number);
        System.out.println(number+" factorial = "+result);
    }

    private static int factorial(int n){
        if(n != 0){
            return n * factorial(n -1);
        }else {
            return 1;
        }
    }
}
