def decorator1(func):
    def wrapper():
        print("Before Function")
        func()
    return wrapper


def decorator2(func):
    def wrapper():
        func()
        print("After Function")
    return wrapper


@decorator1
@decorator2

def greet():
    message = input("Enter String : ")
    print(message)


greet()