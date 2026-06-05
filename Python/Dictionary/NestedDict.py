nested_dict = {
    'person' : {'name' : 'John', 'age': 31,},
    'address' : {'city ':'Pune', 'zip' : 411038}
}

print(nested_dict)

# To print 31
a = nested_dict['person']['age']
print(a)

# To print zip
b = nested_dict['address']['zip']
print(b)

# Update value
nested_dict['person']['name'] = "Aryan"
print(nested_dict)

print(nested_dict['country']) # gives key error if key does not exist