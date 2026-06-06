with open("data.txt", "r") as file:
    content = file.read()

word = "this"
count = content.count(word)

print(f"'{word}' appears {count} times")