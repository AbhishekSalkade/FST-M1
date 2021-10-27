fruit_shop = {
    "apple": 100,
    "banana": 25,
    "orange": 80,
    "kiwi": 150,
    "watermelon":30,
    "pineapple":40
}

fruit = input("Which fruit you want to buy ").lower()

if fruit in fruit_shop:
    print("Yes, this is available")
else:
    print("No, this is not available")