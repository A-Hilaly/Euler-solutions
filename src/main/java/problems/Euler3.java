package problems;

import java.math.*;


public class Euler3 {


	static boolean isprime(long p)
	{
		int i;
		if (p%2==0) {
			return false;
		}
		for (i=3;i<Math.sqrt(p)+1;i++){
			if (p%i==0){
				return false;
			}
		}
		return true;
	}

	static long solution(){
	    long n=600851475143L;
		int i;
		long largestfactor=0;
		for (i=1001;i<Math.sqrt(n);i=i+2){
			if (n%i==0 && isprime(i)){
				largestfactor=i;
			}
		}
		return largestfactor;
	}

}
