import java.util.Scanner;

public class Inputan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan inputan angka : ");
        int angka = input.nextInt();
        System.out.println("ankga anda adalah "+angka);
        input.close();
    }
}
