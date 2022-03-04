public class QuarterTheYear {
    public static void main(String[] args) {
        System.out.println(quarterOf(12));
    }
    private static int quarterOf(int month){
        if(month >=1 && month <=3){
            return 1;
        }else if(month >= 4 && month <= 6){
            return 2;
        }else if(month >= 7 && month <=9){
            return 3;
        }else {
            return 4;
        }
    }
}
