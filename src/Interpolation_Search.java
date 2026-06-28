public class Interpolation_Search {

    public static void main(String args[]) {

        // interpolation search = improvement over binary search best used for uniformly distributed data
        // guesses where a vlaue might be based on calculated probe results if probe is incorrect, search area is narrowed, and a new probe is calculated
        // runtime average: O(log(log(n)))
        // worst case: O(n)

        /* afterword
            so it is just like the binary search, but better
            the main difference is that in a binary search the middle of the search area is used, but in interpolation search a "probe" is used to
            try and calculate a better search point than just middle, works best with uniformly distributed data
         */

        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9,}; // finds in first attempt
        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

        int index = interpolationSearch(array, 256);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }

    }

    private static int interpolationSearch(int[] array, int value) {
        int high = array.length - 1;
        int low = 0;

        while (value >= array[low] && value <= array[high] && low <= high) {
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);

            System.out.println("probe: " + probe);

            if (array[probe] == value) {
                return probe;
            } else if (array[probe] < value) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }
        return -1;
    }
}
