class Grandfather:
    def abc(self):
        print("I am grandfather")

class Father(Grandfather):
    def xyz(self):
        print("I am father")

class Son(Father):
    def gwe(self):
        print("I am son")

f = Son()

f.abc()
f.xyz()
f.gwe()