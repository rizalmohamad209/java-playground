public class SquareEveryDigit {
    public static void main(String[] args) {
        System.out.println(squareDigits(91119));
    }
    public static int squareDigits(int n) {
        String number = Integer.toString(n);
        String res="";
        for (int i = 0;i<number.length();i++){
            char hasil =  number.charAt(i);
            int fix= Character.getNumericValue(hasil);
            int lk = fix * fix;
            String tambah = Integer.toString(lk);
            res = res + tambah;
        }
        int result = Integer.parseInt(res);

        return result;
    }
}
