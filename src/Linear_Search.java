public class Linear_Search {

    public static void main(String args[]) {

        // a linear search iterates through a collection one element at a time
        // runtime: O(n)
        /* disadvantages:
            slow for large data sets
         */
        /* advantages:
            fast for searches of small to medium data sets
            collection does not need to be sorted
            useful for data structures that do not have random access (linked list)
         */

        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5}; // array is not sorted
        int value = 6;
        int index = linearSearch(array, value);
        if (index != -1) {
            System.out.println("Found " + value + " at index: " + index);
        } else {
            System.out.println("Did not find " + value + " in list");
        }
    }

    private static int linearSearch(int[] array, int val) { // literally just "searches" through the entire array/list looking for the val
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                return i;
            }
        }
        return -1;
    }
}
