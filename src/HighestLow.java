import java.util.Arrays;

public class HighestLow {
    public static void main(String[] args) {
        System.out.println(highAndLow("5 3 1 2 4"));
    }
    public static String highAndLow(String numbers){

        String[] arrOfStr = numbers.split(" ");
        int size = arrOfStr.length;
        int [] arr = new int[size];
        for(int i=0;i<size; i++){
            arr[i] = Integer.parseInt(arrOfStr[i]);
        }

        Arrays.sort(arr);
        return Integer.toString(arr[arr.length-1])+" "+Integer.toString((arr[0]));




    }
}
