# what is a linear search?: a linear search is a searching algorithm that runs O(n) time and "linearly" --goes in a straight line, from start to end-- to find
# something

def linearSearch(array, target):
    for i in range(len(array)): 
        if array[i] == target:
            return i
    return -1

#array = [] # array to be used for linear search
#for i in range(5): # populates array with the first 5 integers starting at 0
#     array.append(i)

array = [5, 3, 2, 9, 8, 1]

index = linearSearch(array, 3)

print(f"Element found at index: {index}")