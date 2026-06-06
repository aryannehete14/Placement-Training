def oddEven(n):
    for i in range(n + 1):
        if i % 2 == 0:
            yield f"{i} is Even"
        else:
            yield f"{i} is Odd"

g = oddEven(10)

print(list(g))