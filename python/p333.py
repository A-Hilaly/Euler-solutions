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


class P333Solver(object):

    def __init__(self):
        self._init_env()

    def _init_env(self):
        self.L = 1000000
        self.primes = self._init_primes()[1]
        self._init_powers()
        self.pmatrix = None

    def _init_primes(self):
        _ = _fprimes(2, self.L)
        return _, dict(zip(_, [0] * len(_)))


    def _init_powers(self):
        self.powers = {2: [1], 3: [1]}
        for e in [2, 3]:
            while self.powers[e][-1] < self.L:
                self.powers[e].append(self.powers[e][-1]*e)
        self.pmatrix = [
            [self.powers[3][i3] * self.powers[2][i2] for i3 in range(
                len(self.powers[3]))
            ] for i2 in range(
                len(self.powers[2])
            )
        ]
        print(self.pmatrix)

    def rec(self, x, sy, summ):
        if x == -1:
            if summ in self.primes:
                self.primes[summ] += 1
        else:
            self.rec(x - 1, sy, summ)
            for y in range(sy, len(self.powers[2])):
                print(x, y, sy, summ)
                s = summ + self.pmatrix[y][x]
                if s >= self.L:
                    return
                self.rec(x - 1, y + 1, s)
        return

    def _solve(self):
        try:
            self.rec(len(self.powers[3])-1, 0, 0)
        except:
            raise Exception("Fix me")
        summ = 0
        for p, count in self.primes.items():
            if count == 1:
                summ += p
        return summ

    @classmethod
    def solve(cls):
        obj = object.__new__(cls)
        obj.__init__()
        print(obj._solve())

if __name__ == "__main__":
    P333Solver.solve()
