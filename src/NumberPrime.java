public class NumberPrime {
    public static void main(String[] args) {
        System.out.println(prime(6));
    }
    private static Boolean prime(int num) {

        if(num <2){
            return false;
        }

        if(num ==2){
            return true;
        }
        double max = Math.sqrt(num);


        System.out.println(max);
        for(int i =2; i< max;i++){
            if(num % 1 == 0){
                return true;
            }
        }
        return false;
//        int cek =0;
//        for(int i=2;i<= num;i++){
//            if(num % i == 0){
//                return  true;
//            }else{
//                return false;
//            }
//
//        }

//        if(cek ==1){
//            return true;
//        }else{
//
//            return false;
//        }


    }
}
