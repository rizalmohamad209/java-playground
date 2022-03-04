import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan no menu : ");
        int menu = input.nextInt();

        switch (menu){
            case 1:
                System.out.println("menu kambing");
                break;
            case 2:
                System.out.println("menu ayam");
                break;
            case 3:
                System.out.println("menu ikan");
                break;
            default:
                System.out.println("bukan menu makanan");
                break;

        }
    }
}
