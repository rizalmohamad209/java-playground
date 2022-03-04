public class DnaRnaConversion {
    public static void main(String[] args) {
        System.out.println(dnaRnaConversion("GCAT"));
    }
    private static String dnaRnaConversion(String dna){
        String res = "";
        char []arr = dna.toCharArray();
        for(int i=0; i<arr.length;i++){
            if(arr[i] =='T'){
                res += 'U';
            }else {
                res += arr[i];
            }
        }
        return res;
    }
}
