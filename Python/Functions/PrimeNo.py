def isPrime(n):
    if(n <= 1):
        print(n, "is Not Prime Number")
    elif(n==2 or n==3):
        print(n, "is Prime Number")
    elif(n%2==0 or n%3==0):
        print(n, "is Not Prime Number")
    elif(n % 5 == 0 or n % 7 == 0):
        print(n, "is Not Prime Number")
    else:
        print(n, "is Prime Number")

n = int(input("Enter the Number : "))
print(isPrime(n))


