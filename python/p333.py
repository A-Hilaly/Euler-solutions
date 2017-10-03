import math


def _fprimes(s,e):
    def _isprime(n):
        if n%2 == 0: return False
        for k in range(3, int(math.sqrt(n)) + 1):
            if n%k == 0: return False
        return True
    if s == 2:
        l = [2]
    else:
        l = []
    for i in range(s, e):
        if _isprime(i):
            l.append(i)
    return l

_p = _fprimes(2, 1000000)

primes = dict(zip(_p, [0]*len(_p)))

print("got primes :", len(_p), _p[:20])

L = 1000000
powers = {2: [1], 3: [1]}

for e in [2, 3]:
    while powers[e][-1] < 1000000:
        powers[e].append(powers[e][-1]*e)

p = [[powers[3][i3]*powers[2][i2] for i3 in range(len(powers[3]))]
     for i2 in range(len(powers[2]))]

print("got powers :", len(powers), len(powers[2]), len(powers[3]))


def rec(x, start_y, mysum):
    if x == -1:
        if mysum in primes:
            primes[mysum] += 1
    else:
        rec(x-1, start_y, mysum)
        for y in range(start_y, len(powers[2])):
            s = mysum + p[y][x]
            if s >= L:
                return
            rec(x-1, y+1, s)
    return

rec(len(powers[3])-1, 0, 0)

mysum = 0
for p, count in primes.items():
    if count == 1:
        mysum += p

print("mysum" , mysum)
