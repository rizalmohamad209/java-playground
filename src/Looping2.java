import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Looping2 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = 3;
//        for(int i=1 ;i<=5;i++){
//            System.out.println(a + "x" +i+ "="+a*i);
//        }

//        int arr[]={12,34,21,33,22,55};
//        int i=0;
//        while (i < arr.length){
//            if(i ==3)
//                return;
//            System.out.println(arr[i]);
//            i++;
//
//        }

        List<Integer> arr= Arrays.asList(new Integer[]{12,34,21,33,22,55});
        int i=0;
        while (i< arr.size()){
            if(i==3)
                return;
            System.out.println(arr.get(i));
        }
    }
}

