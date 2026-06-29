# what is a binary search?: a search algorithm that only works with a SORTED array
# it halves the search area each iteration

def binarySearch(array, target):
    leftPointer = 0
    rightPointer = len(array) - 1

    while leftPointer <= rightPointer:
        middle = leftPointer + (rightPointer - leftPointer) // 2 # middle, or the average, is a + b / 2, i mean that's just what mean means in math
        if array[middle] < target: # if the middle is less than the target, or the target is greater than the middle we search the upper section
            leftPointer = middle + 1
        elif array[middle] > target: # opposite of the previous and so we search the lower section
            rightPointer = middle - 1
        else: # if the target is neither greater than nor less than the middle and this while loop still ran then the middle is the target
            return middle
    return -1 # if the while loop finishes execution and this runs, then the value is not in the SORTED array

#array = [1, 2, 3, 4, 5, 6, 7, 8, 9]
array = [1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024]

index = binarySearch(array, 5)

print(index)