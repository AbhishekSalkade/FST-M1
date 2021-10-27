def ListChecker():
    list1 = []
    length=int(input("how many numbers you wand to add to the list:"))

    for i in range(length):
        num= int(input("enter number to the list :"))
        list1.append(num)

    print(list1)

    if list1[0] == list1[-1]:
        return True
    else:
        return False


result=ListChecker()
print(result)
