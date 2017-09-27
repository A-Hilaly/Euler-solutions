

class prime_generator(object):
    def __init___(self):
        self.primes = [2, 3]

    def can_solve(self, n):
        return n <= self.primes[-1]**2:

    def is_prime(n):
        if n in self.primes:
            return True
        from math import sqrt, floor
        if not self.can_solve(n):
            raise Exception('noobi')
        else:
            for i in self.primes:
                if i > floor(sqrt(n)+1):
                    self.primes.append(n)
                    return True
                if n%i == 0:
                    return False
            self.primes.append(n)
            return True
