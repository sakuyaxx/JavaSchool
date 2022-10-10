import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] unsortedArray = {3, 33, 27, 55, 16, 11, 10, 31, 5, 7, 14, 4, 47, 20, 24, 77, 8, 1, 22};
        int[] sortedArray = selectionsort(unsortedArray);

        System.out.println(Arrays.toString(sortedArray));           //gibt den gesamten Array als String aus
    }

    public static int[] selectionsort(int[] sortedArray) {
        for (int i = 0; i < sortedArray.length - 1; i++) {
            /* i = zählen ab der ersten Stelle; length - 1 --> bis zur vorletzten Stelle
               die erste Zahl im Array wird mit den anderen verglichen.
               Nach diesem Vorgang muss man die letzte Stelle mit nichts mehr vergleichen. */
            for (int j = i + 1; j < sortedArray.length; j++) {
                /* die zweite Stelle der Array wird auch mit den anderen verglichen */
                if (sortedArray[i] > sortedArray[j]) {
                    int temp = sortedArray[i];
                    /* bei Selection Sort soll die Zahl an der Stelle i kleiner sein als an der Stelle j
                       --> Falls dies nicht der Fall ist, wird die Zahl an der Stelle i temporär in der Variable
                           temp gespeichert. */
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                    /* nachdem die Zahl in dieser Variable gespeichert wurde, können die Zahlen an der Stelle
                       i und j ausgetauscht werden. Dieser Vorgang wird ausgeführt, bis alle Zahlen in der richtigen
                       Reihenfolge sind. */
                }
            }
        }

        return sortedArray;
    }
}
