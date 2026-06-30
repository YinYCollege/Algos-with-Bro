# what is selection sort?: honestly, i do not remember from just trying my hardest to remember
# starting at the first index, it iterates through the array and selects either the smallest or the largest value and places it before moving on

def selectionSort(array): 
    for i in range(len(array) - 1): # i will iterate through the array from 0 to the length of the array - 1 so that j can be i + 1, the index that will change
        val, j = i, i + 1 # val is the value of the index of our desired number and j just represents the number currently being tested
        while j < len(array): 
            if array[val] > array[j]: # if value at j is desired over what we have at val then we swap the index
                val = j 
            j += 1 
        temp = array[i] # array index we change as we go through
        array[i] = array[val] # change
        array[val] = temp # change

array = [8, 2, 3, 4, 1, 9, 7, 5, 6, -1, 99, -2]

selectionSort(array)

for i in array:
    print(i)