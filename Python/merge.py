# what is merge sort?
# merge sort is an algorithm that takes an array and recursively divides until it reaches a length of 1 and with the use of a helper function "merges" them together
# afterword: mergeSort(left) and mergeSort(right) ensures that the array starts merging at a length of 1 or merges using the helper function merge to merge the 
# sorted arrays left or right

def mergeSort(array):
    length = len(array)
    if length <= 1: return # base case to start merging at a length of 1
    mid = length // 2
    left, right = array[:mid], array[mid:] 
    mergeSort(left) # recursively calls the function on a sub array of elements to the left of the middle
    mergeSort(right) # recursively calls the function on a sub array of elements to the right of the middle
    merge(left, right, array) # array is the original array before being split into two separate arrays

def merge(left, right, array):
    leftSize, rightSize, i, j, k = len(left), len(right), 0, 0, 0 # initializes variables and indexes to work with the lengths of the 3 arrays
    while i < leftSize and j < rightSize: # while both left and right still have elements
        if left[i] < right[j]: # compares the two elements of their respective pointers to see which one is smaller then update
            array[k] = left[i]
            i += 1
        else:
            array[k] = right[j]
            j += 1
        k += 1
    while i < leftSize: # runs only when the left still has elements and updates
        array[k] = left[i]
        i += 1
        k += 1
    while j < rightSize: # runs only when the right still has elements and updates
        array[k] = right[j]
        j += 1
        k += 1

array = [100, 8, 2, 3, 4, 1, 9, 7, 5, 6, -1, 99, -2]

mergeSort(array)

for i in array:
   print(i)