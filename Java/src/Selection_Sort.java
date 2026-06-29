public class Selection_Sort {
    public static void main(String args[]) {

        // selection sort iterates through the array and finds the smallest/greatest number to replace the current index
        // runtime: O(n^2)

        int array[] = {8, 7, 9, 2, 3, 1, 5, 4, 6};
        selectionSort(array);

        for (int i : array) {
            System.out.print(i);
        }

    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i]; // stores the current index we started at

            // these two lines takes the minimum or maximum we found and replaces the current index
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
