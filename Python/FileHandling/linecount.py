# Append a new line
with open("data.txt", "a") as file:
    file.write("\nthis is a new line code")

# Count lines
with open("data.txt", "r") as file:
    count = len(file.readlines())

print("Total lines in file:", count)