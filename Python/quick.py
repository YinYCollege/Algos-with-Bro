# what is quick sort?
# okay so I am pretty sure I already explained what quick sort is in insertion sort, but i'll explain it again
# quick sort is a recursive sorting algorithm where we choose a pivot, at the end in my case, and then with two pointers starting at index -1 and 0 to compare 
# that to the pivot and swapping the values of the two indicies if the one compared at 0 is desired
# i, j = -1, 0 -- we are always incrementing j and only incrementing i if array[j] < pivot and then swapping if array[j] < pivot, otherwise just continue
# after the first iteration the j will be at the pivot and the pivot will be swapped with array[i + 1]
# elements left of the pivot will be smaller and greater to the right

def quickSort(array, start, end):
    if end <= start: return # we stop when the length of the array is 1
    pivot = partition(array, start, end) # this returns the index that the pivot ends up at so values left of the pivot will be smaller and greater to its right
    quickSort(array, start, pivot - 1) # recursively calls the function on the elements smaller than the pivot
    quickSort(array, pivot + 1, end) # recursively calls the function on the elements greater than the pivot

def partition(array, start, end):
    pivot = array[end] # we choose the pivot to be the value at the end of the array
    i = start - 1 # i is the index that we keep track of as values smaller than the pivot and will start at -1
    while start <= end - 1: # start is the index starting at 0 and it will iterate through the array until it reaches the end
        if array[start] < pivot: # if the current value is smaller than the pivot
            i += 1 # we increment i by 1
            temp = array[i] # and with these three lines do a simple switch
            array[i] = array[start]
            array[start] = temp
        start += 1 # keep incrementing start, our current tracker, by 1 if the value is larger than the pivot
    i += 1 # after the iteration when start == end, we increment by i one more time to swap it with the pivot so that the pivot is in the right spot
    temp = array[i] # simple swap
    array[i] = pivot
    array[end] = temp
    return i # return i, the index that the pivot is now correctly placed at

array = [100, 8, 2, 3, 4, 1, 9, 7, 5, 6, -1, 99, -2]

quickSort(array, 0, len(array) - 1)

for i in array: print(i)