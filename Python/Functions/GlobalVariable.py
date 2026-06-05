balance = 1000

def withdraw(amount):
    global balance
    if amount <= balance:
        balance -= amount
        print(f"Withdrawal successful. Remaining balance: {balance}")
    else:
        print(f"Insufficient Balance.")

withdraw(200)
print(f"Balance outside function: {balance}")