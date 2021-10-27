list1 = []
length=int(input("how many numbers you wand to add to the list:"))

for i in range(length):
    num= int(input("enter number to the list :"))
    list1.append(num)

print(list1)
sum1=0
for item in list1:
    sum1=sum1+int(item)
print(sum1)