public class Sorting {
    public static void main(String[] args) {
        int arr []={6,6,5,9,2};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp=0;
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        String kata= "MAKANNASI";
        char [] arry = kata.toCharArray();
        for(int i=0;i<arry.length;i++){
            for(int j=i+1;j<arry.length;j++){
                int temp=0;
                if(arry[i] > arry[j]){
                    temp = arry[i];
                    arry[i]=arry[j];
                    arry[j]=(char)temp;
                }
            }
            System.out.print(arry[i]);
        }

    }
}
