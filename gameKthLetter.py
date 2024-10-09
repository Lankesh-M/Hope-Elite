def kthCharacter(k , operations):
    s = "a"
    op = 0
    while( len(s) < k):
        genStr = ""
        if(operations[op] == 0):
            genStr = s
        else:
            for let in s:
                genStr += chr(ord(let) + 1)
                # print(genStr)
        s += genStr
        op += 1
        # print(s)
    return s[k-1]

k = 26642561
operations = [0,0,0,0,0,0,1,0,1,1,1,0,1,0,1,1,0,0,0,1,0,0,1,1,1]
print(kthCharacter(k, operations))