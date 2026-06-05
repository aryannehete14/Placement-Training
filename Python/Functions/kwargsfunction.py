# *args -> tuple
def func1(*args):
    print(args)

# **kwargs -> dictionary
def func2(**kwargs):
    print(kwargs)

func1(1, 2, 3)
func2(name="Aryan", age=21)