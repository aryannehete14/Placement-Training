# Print square of x
squared_dict = {x : x**2 for x in range(1,5)}
print(squared_dict)


# Method 2 - 
dict = {"a " : 2, "b" : 3, "c":4}
for key in dict:
    dict[key] **=2

print(dict)

# Print squares greater than or equal to 4
squared_dict = {x: x**2 for x in range(1, 5)}

for key, value in squared_dict.items():
    if value <= 4:
        print(key, ":", value)

# Method 3 - 
squared_dict = {x: x**2 for x in range(1, 5) if x<=4 }
print(squared_dict)
