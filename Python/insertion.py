# what is insertion sort? 
# before looking at java file: i think insertion sort is where we pick a value, array[len(array) - 1] in my case choosing the last element, and with two pointers
# if array[j] > array[end] then j += 1 else i += 1 then temp, array[i], array[j] = array[i], array[j], temp, this switches the elements around if array[j] is less
# after looking at java file: i was talking about quick sort or smth, it's just starting from index 1 on a 0-indexed array and checking every element to its left

def insertionSort(array): # starting at index 1 it iterates through the array and compares the current index's value to the elements to its left
    for i in range(len(array) - 1): # this for loop makes i take the value of every index starting from 0 and the index we want to swap elements with
        i += 1 # we change i to be the index after the index of the value we want to swap with
        temp = array[i] # temporary value is what we use to compare the rest of the array
        while i > 0 and array[i - 1] > temp: # i starts at 1 and will check every index to its left, indexes with values lower than temp will swap values
            array[i] = array[i - 1]
            i -= 1
        array[i] = temp

array = [100, 8, 2, 3, 4, 1, 9, 7, 5, 6, -1, 99, -2]

insertionSort(array)

for i in array:
    print(i)