# 1. Create and Write
file = open("sample.txt", "w")
file.write("Hello World\n")
file.write("Welcome to Python File Handling\n")
file.close()

print("File created and data written.")

# 2. Read Entire File
file = open("sample.txt", "r")
print("\nReading File:")
print(file.read())
file.close()

# 3. Append Data
file = open("sample.txt", "a")
file.write("This line is appended.\n")
file.close()

print("\nData appended successfully.")

# 4. Read Again After Append
file = open("sample.txt", "r")
print("\nFile After Append:")
print(file.read())
file.close()

# 5. Read Line by Line
file = open("sample.txt", "r")
print("\nReading Line by Line:")
for line in file:
    print(line.strip())
file.close()