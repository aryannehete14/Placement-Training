string = input("Enter a String: ")

reverse = ""

for ch in string:
    reverse = ch + reverse

if string == reverse:
    print("Palindrome")
else:
    print("Not a Palindrome")