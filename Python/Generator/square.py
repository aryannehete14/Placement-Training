def square_numbers(n):
    for i in range(n + 1):
        yield i * i

g = square_numbers(10)

print(list(square_numbers(10)))

print(next(g))
print(next(g))
print(next(g))
print(next(g))
print(next(g))
print(next(g))
print(next(g))
print(next(g))
print(next(g))
print(next(g))
print(next(g))

