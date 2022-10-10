import java.util.Arrays;

public class BaseAlgorithms {
    public static void main(String[] args) {
        int[] unsortedArray = {3, 33, 27, 55, 16, 11, 10, 31, 5, 7, 14, 4, 47, 20, 24, 77, 8, 1, 22};
        int[] revertedArray = revert(unsortedArray);

    }
    public static int[] revert(int[] revertedArray) {
        int[] forArray = new int[revertedArray.length];
        int temp = 0;
        for (int i = revertedArray.length - 1; i >= 0; i--) {
            forArray[temp] = revertedArray[i];
            temp++;
        }
        System.out.println(Arrays.toString(forArray));
        return revertedArray;

        /*int max = forArray[0];
        for(int i=0 ; i<forArray.length ; i++)
            if (max<forArray[i])
                max = forArray[i] ;
        System.out.println("max = " + max);

        int min = forArray[0];
        for(int i=0 ; i<forArray.length ; i++)
            if (min>forArray[i])
                min = forArray[i] ;
        System.out.println("min = " + min);*/
    }
}
