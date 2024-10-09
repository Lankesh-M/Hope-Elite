# 1 - 10.000 Circular Prime Number 173 --
def isPrime(num):
    for n in range(2, num//2+1):
        if(num%n == 0):
            return False
    return True

# print(isPrime(4))
for num in range(2 , 100):
    if(isPrime(num)):
        # Reverse
        # revNum = int(str(num)[::-1])
        # if(isPrime(revNum)):
        #     print(num, revNum)
        print(num, end=" ")
