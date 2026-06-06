def prime_numbers(n):
    for num in range(2, n + 1):
        for i in range(2, int(num**0.5) + 1):
            if num % i == 0:
                break
        else:
            yield num

g = prime_numbers(20)

print(list(g))

g = prime_numbers(20)

print(next(g))
print(next(g))
print(next(g))
print(next(g))
print(next(g))
print(next(g))