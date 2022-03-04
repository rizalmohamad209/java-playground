import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai sisi a : ");
        int a = input.nextInt();
        System.out.print("Masukan nilai sisi b : ");
        int b = input.nextInt();
        System.out.print("Masukan nilai sisi c : ");
        int c = input.nextInt();

        if(a == b && c == b){
            System.out.println("segitiga sama sisi");
        }else if(a == b || a == c || b == c){
            System.out.println("segitiga sama kaki");
        }else{
            System.out.println("segitiga sembarang");
        }

    }
}
