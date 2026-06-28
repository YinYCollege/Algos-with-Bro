public class Bubble_Sort {

    public static void main(String args[]) {

        // the bubble sort is an algorithm that pairs adjacent elements and compares them and swaps them if they are not in order
        // the algorithm will make sure the smallest/largest go to the very top, then the second, then the third and will keep repeating until sorted
        // runtime: O(n^2)

        /* afterword:
            hardest part to conceptualize is why we need two for loops, and what exactly i and j represents
            i represents how many times the inner for-loop has been processed, and the inner for-loop
            ensures that either the smallest or greatest gets to the back
            j is a tracker that tracks either the smallest or largest number
            after each inner for-loop, i is incremented which means another number was sorted, and so the inner for-loop does not need to go
            so far back to keep sorting which is why j < array.length - i -1
         */
        int array[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        bubbleSort(array);

        for (int i: array) {
            System.out.println(i);
        }

    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) { // i starts at 0 and increments every time the inner for-loop completes, the inner for-loop ensures that the greatest or smallest number reaches the end
            for (int j = 0; j < array.length - i - 1; j++) { // j starts at 0 every time because it is a tracker, it tracks the greatest or smallest number as it reaches the end
                if (array[j] > array[j + 1]) { // ascending order if j > j + 1, descending order if j < j + 1
                    int temp = array[j]; // makes a temporary variable to store the value at array[j] since it will be changed

                    // two lines of code that just switches the values of array[j] and array[j + 1]
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
