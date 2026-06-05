string = input("Enter String : ")

def vowel(string):
    count = 0

    for ch in string.lower():
        if ch in "aeiou":
            count += 1

    return count

print("Number of vowels:", vowel(string))
