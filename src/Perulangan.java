public class Perulangan {
    public static void main(String[] args) {
        System.out.println("Soal 1 ke a");
        System.out.println("Menggunakan for");
        int angka = 0;
        for (int i = 0; i <=5; i++) {

            if(i<=3){
                angka = angka+2;
                System.out.print(angka+",");
            }
            if(i>3){
                angka = angka *2;
                System.out.print(angka+",");
            }


        }
        System.out.println("");
        int pertama=1;
        int kedua=2;

        for (int i=1;i<=5;i++){
            kedua = pertama * kedua;
            pertama = kedua;

            System.out.println(kedua+",");
        }
////        System.out.println("");
//        System.out.println("Menggunakan while");
//        int w = 1;
//        while (w<=16){
//            System.out.print(w*2+" ");
//            w=w*2;
//        }
//
//        System.out.println("");
//        System.out.println("Menggunakan Do while");
//        int y=1;
//        do {
//            System.out.print(y * 2 + " ");
//            y = y * 2;
//        }while (y<=16);
//
//        System.out.println("");
//        System.out.println("Soal 1 ke b");
//        System.out.println("Menggunakan for");
//        int pertama = 2;
//        int kedua=1;
//        for(int j=2;j<=32;j=pertama*kedua ){
//            kedua=pertama;
//            pertama=j;
//            System.out.print(j+" ");
//        }
//        System.out.println("");
//        System.out.println("Menggunakan while");
//        int first = 2;
//        int second=1;
//        int i=2;
//        while(i<256){
//            i=first * second;
//            second=first;
//            first=i;
//            System.out.print(i+" ");
//
//        }
//        System.out.println("");
//        System.out.println("Menggunakan Do While while");
//        int k = 2;
//        int l=1;
//        int m=2;
//        do {
//            m=k * l;
//            l=k;
//            k=i;
//            System.out.print(m+" ");
//
//        }while (m<256);

    }
    }