from time import sleep
from threading import Thread

class A(Thread):
    def run(self):
        for i in range(3):
            print("Aryan")
            sleep(3)

class B(Thread):
    def run(self):
        for i in range(3):
            print("Nehete")
            sleep(3)

# object
t1 = A()
t2 = B()

# Start thread
t1.start()
t2.start()

# Wait for both threads to complete
t1.join()
t2.join()


