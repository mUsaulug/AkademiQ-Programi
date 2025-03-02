import java.util.Arrays;

public class Soru10 {
    public static void main(String[] args)
    {

        int[] arr = {5, 2, 9, 1, 6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        System.out.println("9'un indeksi: " + Arrays.binarySearch(arr, 9));


        int[] copy = Arrays.copyOfRange(arr, 1, 4);
        System.out.println(Arrays.toString(copy));

        System.out.println(Arrays.equals(arr, copy));


        Arrays.fill(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
}
