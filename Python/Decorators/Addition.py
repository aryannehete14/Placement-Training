def add_decorator(func):
    def wrapper(a,b):
        print("Before performing addition")
        result = func(a,b)
        print("After performing addition")
        return result
    return wrapper

@add_decorator
def add_numbers(x,y):
    return x  + y

print("Result : ", add_numbers(5,7))