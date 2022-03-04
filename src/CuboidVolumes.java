public class CuboidVolumes {
    public static void main(String[] args) {
        int arr1[] = {13, 5, 7};
        int arr2[] = {9, 3, 29};
        System.out.println(findDifference(arr1,arr2));
    }

    private static int findDifference(final int [] firstCuboid, final  int [ ] secondCuboid){
        int hasil1 = 1;
        int hasil2 = 1;

        for(int i = 0;i< firstCuboid.length;i++){
            hasil1 *= firstCuboid[i];
            hasil2 *= secondCuboid[i];
        }

        return Math.abs(hasil1 - hasil2);
    }

}
