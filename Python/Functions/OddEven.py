# def EvenOdd(number):
#     if(number % 2 == 0):
#         return "Even"
#     else:
#         return "Odd"

# number = int(input("Enter the Number: "))

# print(EvenOdd())

# Method 2 

def EvenOdd(number):
    if(number % 2 == 0):
        return "Even"
    else:
        return "Odd"

for i in range(1, 11):
    print(i, "-", EvenOdd(i))

