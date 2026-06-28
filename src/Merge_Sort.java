public class Merge_Sort {
    public static void main(String args[]) {

        // divides an array and recursively merges backwards
        // runtime: O(n log(n)) quasilinear time
        // space: O(n)

        /* afterword:
            logically, i understand it
            it takes an array and keeps on dividing it until it reaches a length of 1
            then it merges it with another array of length 1
            then it recursively just merges upwards with length 2 and so on until the original array is sorted
         */

        int[] array = {8, 2, 5, 3, 4, 7, 6, 1, 9};

        mergeSort(array);

        for (int i : array) {
            System.out.print(i);
        }

    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) return;  //base case
        int middle = length / 2; // integer division hence why two arrays made with middle and length - middle
        int[] left = new int[middle];
        int[] right = new int[length - middle];

        int i = 0; // left array
        int j = 0; // right array

        for (; i < length; i++) {
            if (i < middle) {
                left[i] = array[i];
            } else {
                right[j] = array[i];
                j++;
            }
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, array);
    }

    private static void merge(int[] left, int[] right, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize) {
            if (left[l] < right[r]) {
                array[i] = left[l];
                i++;
                l++;
            } else {
                array[i] = right[r];
                i++;
                r++;
            }
        }
        while (l < leftSize) {
            array[i] = left[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = right[r];
            i++;
            r++;
        }
    }
}
