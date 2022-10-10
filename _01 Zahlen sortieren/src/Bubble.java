import java.util.Arrays;

public class Bubble {
        public static void main(String[] args) {
            int[] unsortedArray = {3, 33, 27, 55, 16, 11, 10, 31, 5, 7, 14, 4, 47, 20, 24, 77, 8, 1, 22};
            int[] sortedArray = bubblesort(unsortedArray);

            System.out.println(Arrays.toString(sortedArray));
        }

        public static int[] bubblesort(int[] sortedArray) {
            System.out.println(Arrays.toString(sortedArray));
            return sortedArray;
        }
    }
