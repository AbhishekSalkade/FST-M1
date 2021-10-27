list1 = [2,3,4,7,9,45,78,65]
list2 = [12,37,54,79,90,5,8,615,112,100,131]
list3 = []
for i in range(len(list1)):
    if list1[i]%2 != 0:
        list3.append(list1[i])

for j in range(len(list2)):
    if list2[j]%2 == 0:
        list3.append(list2[j])

print(list3)