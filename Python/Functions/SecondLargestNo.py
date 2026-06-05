def secondhighest(arr):
    largest = 0;
    second_largest = 0

    for i in range(len(arr)):
        if arr[i] > largest:
            second_largest = largest
            largest = arr[i]
        elif arr[i] > second_largest and arr[i] != largest:
            second_largest = arr[i]
    
    return second_largest

arr = [8,9,5,6,7,1,2,3,4,6]
print("Second Largest Number : ", secondhighest(arr)) 
