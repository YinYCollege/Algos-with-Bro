public class Binary_Search {

    public static void main(String[] args) {

        // a binary search is a search algorithm that finds the position of a target value within a SORTED array
        // half of the array is eliminated during each "step"
        // checks the middle of the SORTED array to see if it's equal to the value then see if the target is greater/less than the middle value
        // very good for a large data set that is SORTED
        // runtime: O(log(n))

        int array[] = new int[1000000];
        int target = -2;
        for (int i = 0; i < array.length; i++) { // populates array
            array[i] = i;
        }

        //int index = Arrays.binarySearch(array, target); // Array binary search method
        int index = binarySearch(array, target);

        if (index == -1) {
            System.out.println(target + " not found");
        } else {
            System.out.println(target + " found at: " + index);
        }
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0; // low for 0-indexed array for first value in SORTED array
        int high = array.length - 1; // -1 because 0-indexed array

        while (low < high) {
            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println("middle: " + value);

            if (value < target) { // if the middle value is LESS than our target we need to search "higher" in the array so we move LOW pointer to the middle
                low = middle + 1;
            }
            else if (value > target) { // if the middle value is GREATER than our target, we need to search "lower" in the array so we move the HIGH pointer to the middle
                high = middle - 1;
            }
            else { // else if the middle value is neither less than nor greater than the target we know we have found the target
                return middle;
            }
        } // because the low and high pointe will always move closer to each other, this while loop will end
        return -1; // if it goes through the whole algorithm and does not find the target value, returns -1 signaling that the target was not found
    }
}
