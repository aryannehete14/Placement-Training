# Decorator - adds extra functionality to another function without changing original function code

def my_deco(func):
    def wrapper():
        print("Before calling Hello")
        func()
        print("After calling Hello")
    return wrapper


@my_deco
def say_hello():
    print("Hello World")

say_hello()
