public class LoopTriangle {
    public static void main(String[] args) {
        System.out.println("Segitiga Pertama");
        for(int i = 1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
        System.out.println("Segitiga kedua");
        for (int i=5;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
        System.out.println("Segitiga ketiga");
        for (int i=5;i>=1;i--){
            for(int j =5;j>i;j--) {
                System.out.print(" ");
            }
                for(int k =1;k<=i;k++){
                    System.out.print(k);
                }

                System.out.println("");

        }
        System.out.println("Segitiga keempat");
//        for(int i=5;i>=1;i--){
//            for (int j=1;j<i;j++){
//                System.out.print(" ");
//            }
//            for (int k=5;k>=i;k--){
//                System.out.print(k);
//            }
//            System.out.println();
//        }
        for(int i=1;i<=5;i++){
            for (int j=5;j>i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }

        System.out.println("Segitiga sama kaki terbalik");
        for (int i=5;i>=1;i--){
            for(int j=5 -1;j>=i;j--){
                System.out.print(" ");
            }for (int k=i;k>=1;k--){
                System.out.print(" "+k);
            }
            System.out.println("");
        }
        System.out.println("Piramid");
        for(int i=1;i<=5;i++){
            for (int j=5;j>i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(" "+k);
            }
            System.out.println();
        }


    }
}
