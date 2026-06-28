public class Quick_Sort {
    public static void main(String args[]) {

        // quick sort moves smaller elements to the left of a pivot
        // recursively divide array in 2 partitions
        // runtime: O(n log(n))
        // worse case: O(n^2) if already sorted
        // space: O(log(n))

        int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};

        quickSort(array, 0, array.length - 1);

        for (int i : array) {
            System.out.print(i);
        }
    }

    private static void quickSort(int[] array, int start, int end) {
        if (end <= start) return; // base case

        int pivot = partition(array, start, end); // take the array, start, and end to sort it where left of the pivot is smaller and right of the pivot is bigger
        // recursively call quickSort to sort the array
        quickSort(array, start, pivot - 1); // start to pivot of array
        quickSort(array, pivot + 1, end); // pivot to end of array
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end]; // the pivot is the number that should be greater than the left and smaller than the right
        int i = start - 1; // starts one index away from the start of the array

        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) { // if the current value at index j is smaller than the pivot
                i++; // increment i which will be at the start of the array (smallest)
                // simple swap between the values at i and j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // after the algorithm runs, j will be at the "end" and i will be at the end of the partition less than our pivot
        i++; // i is incremented so that it can be swapped with the end or our pivot
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        // after the swap the array will be sorted with numbers left of the pivot being smaller and right being larger

        return i;
    }
}
