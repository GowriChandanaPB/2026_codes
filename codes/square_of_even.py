list = []
n = int(input())
for i in range(n):
    list.append(int(input()))
res = []
for i in range(len(list)):
    if list[i] % 2 == 0 :
        res.append(list[i] * list[i])
print(res)