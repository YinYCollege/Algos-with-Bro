# what is a bubble sort?: a sorting algorithm that takes an unsorted array and sorts it, it compares two values and moves either the smaller or larger one towards
# the end

def bubbleSort(array): 
    for i in range(len(array)): 
        for j in range(len(array) - i - 1): # subtracts 1 because the algorithm requires j + 1, and subtracts i because each iteration one element would already be sorted
            if array[j] > array[j + 1]: # bubble is easier than said, it just checks whether or not the very next element follows the criteria then swaps
                temp = array[j]
                array[j], array[j + 1] = array[j + 1], temp

array = [8, 2, 3, 4, 1, 9, 7, 5, 6, -1, 99]

bubbleSort(array)

for i in array:
    print(i)