public class Insertion_Sort {
    public static void main(String args[]) {

        // insertion sort compares the elements to the left and shifts elements to the right to make room for insertion
        // runtime: O(n^2)
        // decent for small data sets, bad for large data sets
        // best case is O(n)

        int array[] = {9, 1, 8, 2, 7, 3, 6, 5, 4};

        insertionSort(array);

        for (int i : array) {
            System.out.print(i);
        }
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) { // swaps temp and array[j] for which j is i - 1 and temp is array[i]
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp; // array j is decremented once more by the end of the while loop so you need to add one back before replacing with temp
        }
    }
}
