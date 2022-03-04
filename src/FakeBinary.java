public class FakeBinary {
    public static void main(String[] args) {
        System.out.println(binary("45385593107843568"));
    }

    private static String binary(String numberString){
        String res="";
        char [] arr = numberString.toCharArray();
        for (int i = 0; i <arr.length;i++){
            if(arr[i] >='5'){
                res +=1;
            }else {
                res +=0;
            }
        }
        return res;
    }

}
