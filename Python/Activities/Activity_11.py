fruit_dict = {
    "apple" : 80,
    "mango" : 60,
    "orange" : 65
}

fruit_name = input("Enter a fruit name to check ").lower()

if(fruit_name in fruit_dict):
    print("Fruit is available.")
else:
    print("Fruit is not available.")