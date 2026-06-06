class Animal:
    def speak(self):
        print("Animal Speaks")


class Dog(Animal):
    def speak(self):
        print("Dog Barks")


class Cat(Animal):
    def speak(self):
        print("Cat Meows")


a = Animal()
d = Dog()
c = Cat()

a.speak()
d.speak()
c.speak()
