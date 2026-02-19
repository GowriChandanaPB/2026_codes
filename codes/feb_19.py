# list1 = [1,6,3,8,5,3,4,7]
# list2 = [9,2,5,1,4,6,8,7]
# output = [1,2,3,3,4,4,5,5,6,6,7,7,8,8,9]

l1 = [1,6,3,8,5,3,4,7]
l2 = [9,2,5,1,4,6,8,7]
res = []
res.extend(l1)
res.extend(l2)
for i in range(len(res)):
    for j in range(1, len(res)-i):
        if res[j-1] > res[j]:
            res[j-1], res[j] = res[j], res[j-1]
print(res)






