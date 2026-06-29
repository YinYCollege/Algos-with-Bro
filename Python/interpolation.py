# what is interpolation sort?: i am pretty sure interpolation sort was just a "better" binary sort, meaning that it will also only work on SORTED arrays
# i think the difference from binary search is that we are making a "guess," a probe, based off of a formula (of which i do not understand), and considering 
# it works well with uniformly distributed data it is a formula that was derived with that data set in mind
# formula: low + (high - low) * (target - array[low]) / (array[high] - array[low])
# so it follows the mean formula from mathematics, but in the numerator there's an extra (target - array[low]) and in the denominator (array[high] - array[low])
# 

def interpolationSort(array, target):
    low = 0
    high = len(array) - 1
    
    while low < high:
        probe = low + (high - low) * (target - array[low]) // (array[high] - array[low]) # // for integer division
        if array[probe] == target: # returns the probe, which is the index of target, if match
            return probe
        elif array[probe] > target: # if the target is smaller than our guessed index then search below the probe
            high = probe - 1
        else: # opposite of the previous, meaning the target is larger than our guessed index and to search above the probe
            low = probe + 1
    return -1

array = [1, 2, 3, 4, 5, 6, 7, 8, 9]
target = 8

index = interpolationSort(array, target)

print(f"Index of {target} is {index}")