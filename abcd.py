n = 1
alpha = "abcd"
binary = bin(n)[2:]
res = ""
print(binary)
st = 4 - len(binary)
ind = 0
for i in range(st, len(binary)):
    if binary[ind] == '1':
        res += alpha[ind]
    ind+=1
print(res)
