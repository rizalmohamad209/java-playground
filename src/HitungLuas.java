import java.util.Scanner;

public class HitungLuas {
    public static void main(String[] args) {
//        functionWithoutParams();
//
//        System.out.print("Masukan alas : ");
//        Scanner scanAlas= new Scanner(System.in);
//        double alas = scanAlas.nextDouble();
//
//        System.out.print("Masukan tinggi : ");
//        Scanner scanTinggi = new Scanner(System.in);
//        double tinggi = scanTinggi.nextDouble();
//
//        luasSegitiga(alas, tinggi);
//
//        System.out.println("Luas Persegi adalah "+luasPersegi(20));
        printSomething(5,"Balonku");
        printSomething(sum(5,2),"saya");
    }
    private static void functionWithoutParams(){
        System.out.println("Hello Guys");
    }
    private static void luasSegitiga(double alas, double tinggi){
        double luas = 0;
        luas = alas * tinggi /2;
        System.out.println("Luas Segitiga adalah "+luas);

    }

    private static double luasPersegi(double sisi){
        return sisi * sisi;
    }

    private static void printSomething(int anyInt, String anyString){
        System.out.println(anyString+" ada "+anyInt);
    }

    private static int sum(int angka1,int angka2){
        int jumlah = angka1 + angka2;
        return jumlah;
    }
}
