# Decorator - adds extra functionality to another function without changing original function code

def arithmetic(add):
    def addition(a, b):
        a = int(input("Enter the number : "))
        b = int(input("Enter the number : "))
        add(a + b)
    return addition


@arithmetic
def add(add):
    print("Addition", add)


add(3, 4)