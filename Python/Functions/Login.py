user_id = input("Enter User ID : ")
password = input("Enter Password : ")

def success(user_id, password):
    if user_id == "admin" and password == "1234":
        print("Login Successful")
    else:
        print("Invalid User ID or Password")

success(user_id, password)