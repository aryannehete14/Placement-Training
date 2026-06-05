def fibonacci(n):
    t1 = 0
    t2 = 1

    print("Fibonacci Series:")

    for i in range(n):
        print(t1, end=" ")
        nextTerm = t1 + t2
        t1 = t2
        t2 = nextTerm

fibonacci(10)