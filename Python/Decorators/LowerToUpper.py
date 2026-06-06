def upper_decorator(func):
    def wrapper():
        result = func()
        return result.upper()
    return wrapper


@upper_decorator
def message():
    string = input("Enter the string : ")
    return string


print(message())