my_tuple = []

length=int(input("how many numbers you wand to add to the tuple:"))

for i in range(length):
    num= int(input("enter number to the tuple :"))
    my_tuple.append(num)

my_tuple = tuple(my_tuple)

print(my_tuple)

for num in my_tuple:
    if num%5 == 0:
       print(num)